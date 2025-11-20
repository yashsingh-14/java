 abstract class Avenger {
     String name;
     void introduce (String name){

     }
     abstract void attack();
     
}

 class thor extends Avenger {
     void intro(){
          System.out.println("I am thor");
     }

     void attack(){
          System.out.println("Attack");
     }
     
}
class Iron extends thor{
     void attack(){
          System.out.println("I am Iron");
     }
}
public class bstract {
     
     public static void main(String[]args){
          
          thor t = new thor();
          t.introduce("thor");
          t.attack();

          Iron i = new Iron();
          i.introduce("Iron");
          i.attack();
     } 
}