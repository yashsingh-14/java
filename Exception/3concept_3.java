package Exception;

 class concept_3 {
    public static void main(String[] args) {
        try{
            int a=10/2;
            //int a=10/0;
            System.out.println("value of a:"+a);
            int []arr =new int[2];
            arr[1]=10;
            //arr[5]=10;
            System.out.println("value of Array:"+arr[1]);

            String s="Avenger";
            //String s=null;
            System.out.println("Length of String:"+s.length());
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Occured:"+e);
        }
    }
}
