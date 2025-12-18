package Exception;

class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class UserUncheckedException {

    double balance = 5000;

    void withdraw(double amount) {

        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero");
        }

        if (amount > balance) {
            throw new RuntimeException("Insufficient balance");
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        UserUncheckedException account = new UserUncheckedException();

        account.withdraw(2000);   // success
        account.withdraw(-500);   // InvalidAmountException
        account.withdraw(10000);  // RuntimeException
    }
}