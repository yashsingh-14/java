package Exception;

class concept_5 {
    public static void main(String[] args) {
        System.out.println("Program Started");
        try{
            try{
                int a=10/2;
                // int a=10/0;

            }catch(ArithmeticException e){
                System.out.println("Arithmetic Exception");
            }
            int[]arr = new int [2];
            arr[1]=10;
            //arr[13] = 10;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of range");
        }
        System.out.println("Program Ends");
    }
    
}
