import java.sql.*;
import java.util.Scanner;

public class ATM {
    static Connection con;

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/ATM";
        String user = "Yash";   // change if needed
        String password = "root"; // change if needed

        con = DriverManager.getConnection(url, user, password);

        Scanner sc = new Scanner(System.in);
        int accNo = 101; // fixed account for testing

        while (true) {
            System.out.println("\n====== ATM MENU ======");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                double bal = checkBalance(accNo);
                System.out.println("Current Balance: " + bal);
            } 
            else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double amt = sc.nextDouble();
                deposit(accNo, amt);
                System.out.println("Deposited Successfully!");
                System.out.println("New Balance: " + checkBalance(accNo));
            } 
            else if (choice == 3) {
                System.out.print("Enter withdraw amount: ");
                double amt = sc.nextDouble();
                withdraw(accNo, amt);
                System.out.println("Withdrawal Successful!");
                System.out.println("New Balance: " + checkBalance(accNo));
            } 
            else if (choice == 4) {
                showTransactions(accNo);
            }
            else if (choice == 5) {
                System.out.println("THANK YOU!");
                break;
            } 
            else {
                System.out.println("Invalid option!");
            }
        }

        sc.close();
        con.close();
    }

    static double checkBalance(int accNo) throws Exception {
        PreparedStatement ps = con.prepareStatement("SELECT balance FROM accounts WHERE acc_no=?");
        ps.setInt(1, accNo);

        ResultSet rs = ps.executeQuery();
        if (rs.next()) return rs.getDouble("balance");
        else throw new Exception("Account not found");
    }

    static void deposit(int accNo, double amt) throws Exception {
        PreparedStatement ps = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE acc_no=?");
        ps.setDouble(1, amt);
        ps.setInt(2, accNo);
        ps.executeUpdate();

        PreparedStatement tr = con.prepareStatement("INSERT INTO transactions(acc_no, type, amount) VALUES(?, 'DEPOSIT', ?)");
        tr.setInt(1, accNo);
        tr.setDouble(2, amt);
        tr.executeUpdate();
    }

    static void withdraw(int accNo, double amt) throws Exception {
        double bal = checkBalance(accNo);
        if (amt > bal) {
            System.out.println("⚠️ Insufficient Balance!");
            return;
        }

        PreparedStatement ps = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE acc_no=?");
        ps.setDouble(1, amt);
        ps.setInt(2, accNo);
        ps.executeUpdate();

        PreparedStatement tr = con.prepareStatement("INSERT INTO transactions(acc_no, type, amount) VALUES(?, 'WITHDRAW', ?)");
        tr.setInt(1, accNo);
        tr.setDouble(2, amt);
        tr.executeUpdate();
    }

    static void showTransactions(int accNo) throws Exception {
        PreparedStatement ps = con.prepareStatement(
            "SELECT type, amount, date_time FROM transactions WHERE acc_no=? ORDER BY id DESC"
        );

        ps.setInt(1, accNo);
        ResultSet rs = ps.executeQuery();

        System.out.println("\n====== TRANSACTION HISTORY ======");
        while (rs.next()) {
            System.out.println(
                rs.getString("type") + " | " +
                rs.getDouble("amount") + " | " +
                rs.getTimestamp("date_time")
            );
        }
        System.out.println("=================================");
    }
}
