package Exception;

class concept_1{

public static void main(String[] args) {
    try{
        System.out.println("Before Division");
        //int a=10/2;
        int a=10/0;                    //As Exception Occured
        System.out.println("After Division");
    }
    catch(ArithmeticException e){
        System.out.println("Cannot divide by zero");
        //System.out.println(e);        //provide the output program
        
    }
    System.out.println("Program Continues");
}
}
//only included operational part in try block which can give error
//try{
//int a=10/2;
//}


    
