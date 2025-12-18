package Exception;

 class Bank {

    private double balance;
    public Bank (double balance){
        this.balance=balance;
    }

    public void withdraw(double amount){
        if (amount>balance){
            throw new IllegalArgumentException("Insufficient balance you have only:"+balance);
        }
        balance -= amount;
        System.out.println("withdrawal successful.Remainig balance:"+balance);
    }
    public static void main(String[] args) {
        Bank account = new Bank(5000);
        account.withdraw(6000);
        account.withdraw(3000);
    }
}
