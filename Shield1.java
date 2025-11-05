class Avenger{
    String f_name="Steve Roger";   // instance variable
    static int age=110;    
    
    static void mission() {
        System.out.println("Mission started....");
        //System.out.println("First Name: " + f_name); // cannot access instance variable directly in static method
        System.out.println("Age is is" + age); // can access static variable
    }

}

public class Shield1 {

  public static void main(String[] args) {

    Avenger aven = new Avenger();
    Avenger aven1 = new Avenger();
    Avenger aven2 = new Avenger();

    // Avenger.age = 120;
    Avenger.age = 150;

    System.out.println("Age is is " + aven.age);
    System.out.println("Age is is " + aven1.age);
    System.out.println("Age is is " + Avenger.age);

    Avenger.mission();
    //shield s = new shield();
    //s.mission();

    rocket();
  }
  static void rocket() {
      System.out.println("launched Rocket in galaxy:");
  }

   
  
}