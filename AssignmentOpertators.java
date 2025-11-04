public class AssignmentOpertators {

  public static void main(String[] args) {
    // Assignment (=)
    int x = 5;
    System.out.println("Assignment: " + x);

    // Addition Assignment (+=)
    x += 3;  // Equivalent to x = x + 3
    System.out.println("Addtion Assignment: " + x);

    //Substraction Assignment (-=)
    x -=2;  // Equivalent to x = x - 2
    System.out.println("Substraction Assignment: " + x);

    // Multiplication Assignment (*=)
    x *= 4;   // Equivalent to x = x * 4
    System.out.println("Multiplication Assignment: " + x);

    // Division Assignment (/=)
    x /=2;  // Equivalent to x = x / 2
    System.out.println("Division Assignment: " + x);

    // Floor Divion Assignment (//=)
    // Java automatically uses integer division for integers 
    x /= 3;  // Equivalent to x = x / 3 (integer division)
    System.out.println("Floor Division Assignment: " + x);

    // Modula Assignment (%=)
    x %= 4;  // Equivalent to x = x % 4
    System.out.println("Modulo Assignment: " + x);
    
  }
  
}
