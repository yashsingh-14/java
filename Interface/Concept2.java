package Interface;

interface A {
    int x=20;
    void m1();
}

interface B extends A {
    int x=30;
    void m2();
}

//  If we Don't implements both the method (m1, m2) in sub class then we have to make Demo class as abstract class.
class Demo implements B {
    public void m1() {
        System.out.println("m1 implemented");
        System.out.println("value of x from Interface A: "+A.x);   // InterfaceName.constant
        System.out.println("value of x from Interface B: "+B.x);   // InterfaceName.constant

        // If we don't use InterfaceName.constant then result will be 30 for both
    }
    
    public void m2() {
        System.out.println("m2 implemented");
    }
}

public class Concept2 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.m1();
        obj.m2();
    }
}

