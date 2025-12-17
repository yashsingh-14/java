package Exception;

class concept_4 {
    public static void main(String[] args) {
        try{
            System.out.println("Before Division");
            int a=10/2;
            System.out.println("After Division");
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        finally{
            System.out.println("Finally Block Executed");
        }
        System.out.println("Program continues");
    }
    
}
