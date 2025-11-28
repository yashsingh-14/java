package SuperKeyword;

 class A {
//     A(int A){
//         System.out.println("AAA constructer is called and value is"+x);
//     }
//     String color = "Black";
    
void show(){

    System.out.println("A class is called");
}

}
class B extends A{
    // String color = "white";

    // B(){
    //     String color = "white";

    //     B(){
    //         super(100);
    //         System.out.println("BBB constructer is called");
    //         System.out.println("color is"+color);
    //         System.out.println("color is"+ super.color);
    //     }
   

    void show(){
        super.show();
        System.out.println("B class is called");
    }
}

public class Super1 {

    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}

