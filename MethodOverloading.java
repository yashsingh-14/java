class MethodOverloading {

//     // Square Method
//     public static int square(int num) {
//         return num * num;
//     }

//     // Divide Method
//     public static int divide(int a, int b) {
//         if(b == 0) {
//             throw new IllegalArgumentException("Cannot divide by zero");
//         }
//         return a / b;
//     }

//     // Multiply Method
//     public static int multiply(int a, int b) {
//         return a * b;
//     }

//     // Addition Method
//     public static int addition(int a, int b) {
//         return a + b;
//     }

//     public static void main(String[] args) {

//         System.out.println("Square: " + square(5));        // 25
//         System.out.println("Divide: " + divide(10, 2));    // 5
//         System.out.println("Multiply: " + multiply(3, 4)); // 12
//         System.out.println("Addition: " + addition(7, 8)); // 15

//     }


public static int square(int a){
    return a*a;
}

public static int addition(int a,int b,int c){
    return a+b+c;
}

public static int multiply(int a,int b){
    return a*b;
}

public static int divide(int a,int b){
    return a/b;
}

public static int subtract(int a,int b){
    return a-b;
}

public static void main(String[] args) {
    System.out.println("square:"+square(9));
    System.out.println("addition:"+addition(100, 200, 300));
    System.out.println("multiply:"+multiply(30, 40));
    System.out.println("divide:"+divide(500, 10));
    System.out.println("subtract:"+subtract(100, 110));
    
}

}


