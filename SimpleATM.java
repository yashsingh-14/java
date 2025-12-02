import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Balance: " + balance);
        } 
        else if (choice == 2) {
            System.out.print("Enter amount to deposit: ");
            double amt = sc.nextDouble();
            balance = balance + amt;
            System.out.println("New Balance: " + balance);
        } 
        else if (choice == 3) {
            System.out.print("Enter amount to withdraw: ");
            double amt = sc.nextDouble();
            balance = balance - amt;
            System.out.println("New Balance: " + balance);
        } 
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
