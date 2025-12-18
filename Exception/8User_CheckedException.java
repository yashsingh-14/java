package Exception;

class InsufficientAccountBalanceException extends Exception {
    public InsufficientAccountBalanceException(String message){

    }
}
 class User_CheckedException {
        double balance=5000;

        void withdraw(double amount)throws
        InsufficientAccountBalanceException{
            if (amount > balance){
                throw new InsufficientAccountBalanceException("Insufficient balance in account");
            }
            balance -= amount;
            System.out.println("withdrawal successful.Remainig balance:"+balance);
        }
        public static void main(String[] args) {
            User_CheckedException account = new User_CheckedException();
            try{
                account.withdraw(7000);
            }catch(InsufficientAccountBalanceException e){
                System.out.println("Exception caught:"+e.getMessage());
            }
        }
    }

