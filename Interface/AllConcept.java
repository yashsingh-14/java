package Interface;
// ===== Interface Parent 1 =====
interface A {
    int VALUE = 100;   // constant (public static final)

    void m1();  // abstract method

    default void defaultMethod() {   // default method
        System.out.println("Default method in A");
    }

    static void staticMethod() {     // static method
        System.out.println("Static method in A");
    }
}


// ===== Interface Parent 2 =====
interface B {
    void m2();
}


// ===== Interface extending two interfaces =====
interface C extends A, B {
    void m3();
}


// ===== Class implementing multiple interfaces =====
class Demo implements C {

    public void m1() {
        System.out.println("m1 implemented");
    }

    public void m2() {
        System.out.println("m2 implemented");
    }

    public void m3() {
        System.out.println("m3 implemented");
    }

    void showConstant() {
        System.out.println("VALUE = " + VALUE);
    }
}


// ===== A NORMAL CLASS (Parent Class) =====
class Parent {
    void parentMethod() {
        System.out.println("Method from Parent class");
    }
}


// ===== Class that EXTENDS a class AND IMPLEMENTS an interface =====
class Child extends Parent implements A {

    public void m1() {   // implementing interface A method
        System.out.println("Child: m1 implemented");
    }

    void extra() {
        System.out.println("Child class extra method");
    }
}


// ===== MAIN CLASS =====
public class AllConcept {
    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.defaultMethod();
        A.staticMethod();
        obj.showConstant();

        System.out.println("------------------------");

        // Using Child class that extends Parent and implements A
        Child ch = new Child();
        ch.parentMethod();  // from Parent class
        ch.m1();            // from interface A
        ch.extra();         // Child class own method
    }
}