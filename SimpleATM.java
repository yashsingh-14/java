import java.util.Scanner;

public class SimpleATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = 1234;          // fixed PIN (aap change kar sakte ho)
        int userPin;
        double balance = 1000.0; // starting balance
        int attempts = 0;
        boolean loggedIn = false;

        System.out.println("===== Welcome to Simple ATM =====");

        // ---------- LOGIN PART ----------
        while (attempts < 3) {
            System.out.print("Enter your 4-digit PIN: ");
            userPin = sc.nextInt();

            if (userPin == pin) {
                System.out.println("Login successful ");
                loggedIn = true;
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN (" + attempts + "/3 attempts)");
            }
        }

        if (!loggedIn) {
            System.out.println("Too many wrong attempts. Card blocked! ");
            sc.close();
            return; // program yahi khatam
        }

        // ---------- MAIN MENU PART ----------
        int choice;

        do {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Check Balance
                    System.out.println("Your current balance: ₹" + balance);
                    break;

                case 2:
                    // Deposit
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();

                    if (depositAmount <= 0) {
                        System.out.println("Invalid amount! Deposit must be greater than 0.");
                    } else {
                        balance += depositAmount;
                        System.out.println("Successfully deposited ₹" + depositAmount);
                        System.out.println("Updated balance: ₹" + balance);
                    }
                    break;

                case 3:
                    // Withdraw
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();

                    if (withdrawAmount <= 0) {
                        System.out.println("Invalid amount! Withdraw must be greater than 0.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance! ");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Please collect your cash: ₹" + withdrawAmount);
                        System.out.println("Updated balance: ₹" + balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Simple ATM. Goodbye! ");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }

        } while (choice != 4);

        sc.close();
    }
}