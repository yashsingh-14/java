class Calculator {
    String operation;
    int num1;
    double num2;
    
    // constructors
    Calculator() {
        System.out.println("Calculator constructor is called");
    }
    
    Calculator(String operation) {
        System.out.println("Operation in constructor is: " + operation);
    }
    
    Calculator(int num1, double num2) {
        System.out.println("First number is: " + num1);
        System.out.println("Second number is: " + num2);
    }
    
    void display() {
        System.out.println("This method is called without parameter");
    }
    
    void display(String operation) {
        System.out.println("Operation is: " + operation);
    }
    
    void display(int num1, double num2) {
        System.out.println("First number is: " + num1);
        System.out.println("Second number is: " + num2);
    }
}

public class calculator1 {

    public static void main(String[] args) {
        //Calculator c = new Calculator();
        //Calculator c1 = new Calculator("Addition");
        Calculator c2 = new Calculator(60, 12000);
        //c.display();
        //c.display("Multiplication");
        //c.display(100, 20000);
    }
}