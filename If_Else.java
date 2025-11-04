public class If_Else {

  public static void main(String[] args) {
    
     // Normal if else condition 
     System.out.println("---------Normal if else statement----------");
     if (5 < 4) {
         System.out.println("greater");
     } else{
         System.out.println("smaller");
     }

     System.out.println();

     // Nested if else statement
     System.out.println("--------Nested if else statement----------");
     if (5 > 4) {
         System.out.println("5 is greater");
         if (6 > 7) {
             System.out.println("6 is smaller");
         } else {
             if (7 > 8) {
                 System.out.println("7 is smaller");
             } else {
                System.out.println("8 is greater");
             }
         }
     }
  }
  
}






