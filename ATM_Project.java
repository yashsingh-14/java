import java.util.Scanner;

// BankAccount class
class BankAccount {
    private String userId;
    private String pin;
    private double balance;

    // Constructor
    public BankAccount(String userId, String pin, double balance) {
        this.userId = userId;
        this.pin = pin;
        this.balance = balance;
    }

    // Getters
    public String getUserId() {
        return userId;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

// Main ATM class
public class ATM_Project {
    private BankAccount account;
    private Scanner scanner;

    // Constructor
    public ATM_Project(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    // Main method - program entry point
    public static void main(String[] args) {
        // Create default account
        BankAccount defaultAccount = new BankAccount("Yash123", "4321", 5000.0);
        
        // Create ATM instance and start
        ATM_Project atm = new ATM_Project(defaultAccount);
        atm.start();
    }

    // Start the ATM system
    public void start() {
        System.out.println("=== WELCOME TO JAVA ATM ===");
        
        // Login process
        if (login()) {
            showMainMenu();
        } else {
            System.out.println("Login failed. Too many attempts. Exiting...");
        }
        
        scanner.close();
    }

    // Login verification
    private boolean login() {
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter User ID: ");
            String inputUserId = scanner.nextLine();
            
            System.out.print("Enter PIN: ");
            String inputPin = scanner.nextLine();

            if (inputUserId.equals(account.getUserId()) && inputPin.equals(account.getPin())) {
                System.out.println("Login successful! Welcome, " + account.getUserId());
                return true;
            } else {
                attempts++;
                System.out.println("Invalid credentials. Attempts remaining: " + (MAX_ATTEMPTS - attempts));
            }
        }
        return false;
    }

    // Main menu display and handling
    private void showMainMenu() {
        int choice;
        
        do {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            // Input validation for menu choice
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                choice = 0; // Invalid choice
            }

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    System.out.println("Thank you for using Java ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1-4.");
            }
        } while (choice != 4);
    }

    // Check balance functionality
    private void checkBalance() {
        System.out.println("\n=== ACCOUNT BALANCE ===");
        System.out.println("Current Balance: ₹" + account.getBalance());
    }

    // Deposit money functionality
    private void depositMoney() {
        System.out.println("\n=== DEPOSIT MONEY ===");
        System.out.print("Enter amount to deposit: ₹");
        
        try {
            double amount = Double.parseDouble(scanner.nextLine());
            
            if (amount > 0) {
                account.deposit(amount);
                System.out.println("Successfully deposited: ₹" + amount);
                System.out.println("New Balance: ₹" + account.getBalance());
            } else {
                System.out.println("Invalid amount! Please enter positive value.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric value.");
        }
    }

    // Withdraw money functionality
    private void withdrawMoney() {
        System.out.println("\n=== WITHDRAW MONEY ===");
        System.out.print("Enter amount to withdraw: ₹");
        
        try {
            double amount = Double.parseDouble(scanner.nextLine());
            
            if (amount > 0) {
                if (account.withdraw(amount)) {
                    System.out.println("Successfully withdrawn: ₹" + amount);
                    System.out.println("New Balance: ₹" + account.getBalance());
                } else {
                    System.out.println("Transaction failed! Insufficient balance or invalid amount.");
                }
            } else {
                System.out.println("Invalid amount! Please enter positive value.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric value.");
        }
    }
}