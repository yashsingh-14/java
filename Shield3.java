class Avenger{
    String name;
    int age;
    double power;
    // // constructor
    Avenger(){
        System.out.println("Avenger constructor is called");
    }
    Avenger(String name){
        System.out.println("name of Avenger in constructor is:"+name);
    }
    Avenger(int age,double power){
        System.out.println("Age of Avenger is:"+age);
         System.out.println("power of Avenger is:"+power);
    }
    void display(){
         System.out.println("This mehtod is called without parameter");
    }
    void display(String name){
         System.out.println("Name of Avenger is:"+name);
    }
    void display(int age,double power){
         System.out.println("Age of Avenger is:"+age);
          System.out.println("power of Avenger is:"+power);
    }
}

public class Shield3 {

    public static void main(String[]args){

        //Avenger a = new Avenger();
        //Avenger a1 = new Avenger("Tony Stark");
        Avenger a2 = new Avenger(60,12000);
        //a.display();
        //a.display("Steve Roger");
        //a.display(100,20000);
    }
}