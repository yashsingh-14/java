package Exception;

 class Concept_2 {
    public static void main(String[] args) {
        try{
            int a=10/2;
            //int a=10/0;
            System.out.println("value of a:"+a);

            int[]arr = new int[2];
            arr[1]=10;
            //arr[3]=10;
            System.out.println("value of Array:"+arr[1]);

            String s ="Avenger";
            //String s=null;
            System.out.println("Length of String:"+s.length());
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of range");
        }catch( NullPointerException e){
            System.out.println("Cannot find the error of the Exception");
        }

    }
    
}
