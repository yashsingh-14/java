import java.sql.*;
import java.util.Scanner;

public class ATMApp {

    static Connection con;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/atm_bank";
        String username = "root";
        String password = "root";

        con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Successful");

        System.out.println("\n==== AVAILABLE CUSTOMERS ====");
        showAllCustomers();

        System.out.print("\nEnter Account Number to login: ");
        int accNo = Integer.parseInt(sc.nextLine());

        if (!isValidAccount(accNo)) {
            System.out.println("Invalid Account Number!");
            return;
        }

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        if (!isValidPin(accNo, pin)) {
            System.out.println("Wrong PIN!");
            return;
        }

        System.out.println("\nLogged in as: " + getCustomerName(accNo));

        while (true) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Last 5 Transactions");
            System.out.println("5. Transfer Money");
            System.out.println("6. Change PIN");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1": viewBalance(accNo); break;
                case "2": deposit(accNo); break;
                case "3": withdraw(accNo); break;
                case "4": viewTransactions(accNo); break;
                case "5": transferMoney(accNo); break;
                case "6": changePin(accNo); break;
                case "7":
                    System.out.println("Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Enter Valid Choice");
                    break;
            }
        }
    }

    // DISPLAY ALL CUSTOMERS
    public static void showAllCustomers() throws Exception {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT acc_no, customer_name FROM accounts");

        while (rs.next()) {
            System.out.println(rs.getInt("acc_no") + " | " + rs.getString("customer_name"));
        }
    }

    // VALIDATE ACCOUNT
    public static boolean isValidAccount(int accNo) throws Exception {
        PreparedStatement pst = con.prepareStatement("SELECT acc_no FROM accounts WHERE acc_no=?");
        pst.setInt(1, accNo);
        ResultSet rs = pst.executeQuery();
        return rs.next();
    }

    // VALIDATE PIN
    public static boolean isValidPin(int accNo, String pin) throws Exception {
        PreparedStatement pst = con.prepareStatement("SELECT pin FROM accounts WHERE acc_no=? AND pin=?");
        pst.setInt(1, accNo);
        pst.setString(2, pin);
        ResultSet rs = pst.executeQuery();
        return rs.next();
    }

    // GET NAME
    public static String getCustomerName(int accNo) throws Exception {
        PreparedStatement pst = con.prepareStatement("SELECT customer_name FROM accounts WHERE acc_no=?");
        pst.setInt(1, accNo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) return rs.getString("customer_name");
        return null;
    }

    // VIEW BALANCE
    public static void viewBalance(int accNo) throws Exception {
        PreparedStatement pst = con.prepareStatement("SELECT balance, customer_name FROM accounts WHERE acc_no=?");
        pst.setInt(1, accNo);

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            System.out.println("Customer: " + rs.getString("customer_name"));
            System.out.println("Current Balance: " + rs.getDouble("balance"));
        } else {
            System.out.println("Account Not Found");
        }
    }

    // DEPOSIT
    public static void deposit(int accNo) throws Exception {
        System.out.print("Enter Amount to Deposit: ");
        double amt = Double.parseDouble(sc.nextLine());

        String customerName = getCustomerName(accNo);

        PreparedStatement pst = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE acc_no=?");
        pst.setDouble(1, amt);
        pst.setInt(2, accNo);
        pst.executeUpdate();

        PreparedStatement tr = con.prepareStatement(
            "INSERT INTO transactions(acc_no, customer_name, type, amount) VALUES (?, ?, 'DEPOSIT', ?)");
        tr.setInt(1, accNo);
        tr.setString(2, customerName);
        tr.setDouble(3, amt);
        tr.executeUpdate();

        System.out.println("Amount Deposited Successfully!");
    }

    // WITHDRAW
    public static void withdraw(int accNo) throws Exception {
        System.out.print("Enter Amount to Withdraw: ");
        double amt = Double.parseDouble(sc.nextLine());

        PreparedStatement balQuery = con.prepareStatement("SELECT balance FROM accounts WHERE acc_no=?");
        balQuery.setInt(1, accNo);
        ResultSet rs = balQuery.executeQuery();
        rs.next();
        double currentBalance = rs.getDouble("balance");

        if (amt > currentBalance) {
            System.out.println("Insufficient Balance!");
            return;
        }

        String customerName = getCustomerName(accNo);

        PreparedStatement pst = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE acc_no=?");
        pst.setDouble(1, amt);
        pst.setInt(2, accNo);
        pst.executeUpdate();

        PreparedStatement tr = con.prepareStatement(
            "INSERT INTO transactions(acc_no, customer_name, type, amount) VALUES (?, ?, 'WITHDRAW', ?)");
        tr.setInt(1, accNo);
        tr.setString(2, customerName);
        tr.setDouble(3, amt);
        tr.executeUpdate();

        System.out.println("Amount Withdrawn Successfully!");
    }

    // TRANSFER MONEY
    public static void transferMoney(int senderAcc) throws Exception {
        System.out.print("Enter Receiver Account Number: ");
        int receiverAcc = Integer.parseInt(sc.nextLine());

        if (!isValidAccount(receiverAcc)) {
            System.out.println("Receiver Account Not Found!");
            return;
        }

        System.out.print("Enter Amount to Transfer: ");
        double amt = Double.parseDouble(sc.nextLine());

        // sender balance check
        PreparedStatement balQuery = con.prepareStatement("SELECT balance FROM accounts WHERE acc_no=?");
        balQuery.setInt(1, senderAcc);
        ResultSet rs = balQuery.executeQuery();
        rs.next();
        double senderBalance = rs.getDouble("balance");

        if (amt > senderBalance) {
            System.out.println("Insufficient Balance!");
            return;
        }

        String senderName = getCustomerName(senderAcc);
        String receiverName = getCustomerName(receiverAcc);

        // deduct sender
        PreparedStatement pst1 = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE acc_no=?");
        pst1.setDouble(1, amt);
        pst1.setInt(2, senderAcc);
        pst1.executeUpdate();

        // credit receiver
        PreparedStatement pst2 = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE acc_no=?");
        pst2.setDouble(1, amt);
        pst2.setInt(2, receiverAcc);
        pst2.executeUpdate();

        // transaction logs
        PreparedStatement tr1 = con.prepareStatement(
            "INSERT INTO transactions(acc_no, customer_name, type, amount) VALUES (?, ?, 'TRANSFER OUT', ?)");
        tr1.setInt(1, senderAcc);
        tr1.setString(2, senderName);
        tr1.setDouble(3, amt);
        tr1.executeUpdate();

        PreparedStatement tr2 = con.prepareStatement(
            "INSERT INTO transactions(acc_no, customer_name, type, amount) VALUES (?, ?, 'TRANSFER IN', ?)");
        tr2.setInt(1, receiverAcc);
        tr2.setString(2, receiverName);
        tr2.setDouble(3, amt);
        tr2.executeUpdate();

        System.out.println("Money Transfer Successful!");
    }

    // LAST 5 TRANSACTIONS
    public static void viewTransactions(int accNo) throws Exception {
        PreparedStatement pst = con.prepareStatement(
            "SELECT customer_name, type, amount, date_time FROM transactions WHERE acc_no=? ORDER BY id DESC LIMIT 5");

        pst.setInt(1, accNo);
        ResultSet rs = pst.executeQuery();

        System.out.println("\n==== LAST 5 TRANSACTIONS ====");
        while (rs.next()) {
            System.out.println(
                rs.getString("customer_name") + " | "
                + rs.getString("type") + " | "
                + rs.getDouble("amount") + " | "
                + rs.getTimestamp("date_time")
            );
        }
    }

    // CHANGE PIN
    public static void changePin(int accNo) throws Exception {
        System.out.print("Enter Current PIN: ");
        String oldPin = sc.nextLine();

        if (!isValidPin(accNo, oldPin)) {
            System.out.println("Incorrect Current PIN!");
            return;
        }

        System.out.print("Enter New PIN: ");
        String newPin = sc.nextLine();

        if (newPin.length() < 4) {
            System.out.println("PIN must be at least 4 digits!");
            return;
        }

        PreparedStatement pst = con.prepareStatement(
            "UPDATE accounts SET pin=? WHERE acc_no=?");
        pst.setString(1, newPin);
        pst.setInt(2, accNo);
        pst.executeUpdate();

        System.out.println("PIN Updated Successfully!");
    }
}
