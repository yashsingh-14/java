// public class Shield2 {
    
//     public static void main(String[] args) {
//         System.out.println("Main method");

//         Shield2 s = new Shield2();
//         //s.mission();
//         //s.failed();
//         mission();

//     }

//     static void mission(){
//         System.out.println("mission method inside class");
//         //failed();
//     }
//     void failed(){
//         System.out.println("failed inside class");
//         mission();
//     }

// }

class Avenger{

    static void mission(String name , int age){
        System.out.println("name of hero:"+ name);
        System.out.println("age of hero:"+ age);
    }

    String heroic_name(String hero){
        return "heroic name is  :"+ hero;
    }
}
public class Shield2 {
    public static void main(String[] args){
        System.out.println("Main Method");

        Avenger a = new Avenger();
        Avenger.mission("Steve Roger" ,110);

        String x = a.heroic_name("Captain");
        //String x = Avenger.heroic_name("Captain");
        System.out.println(x);
    }
}


