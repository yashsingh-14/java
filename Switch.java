public class Switch {

  public static void main(String[] args) {
    
     // Switch statement for fruit
     System.out.println("Switch statement:");
     String fruit = "apple";
    
     switch (fruit) {
      case "banana":
      System.out.println("Banana is yellow.");
      break;
     case "apple":
      System.out.println("Apple is red.");
      break;
     case "organge":
      System.out.println("Orange is orange.");
      break;
      default:
          System.out.println("I don't know the color of this fruit.");
     }

     System.out.println("\n----------------------------");
    

    
       // Switch statement for days  (no user input)
       int day = 3; // Change this value to test differnt days
       String dayName;

       switch (day) {
        case 0:
            dayName = "Sunday";
            break;
        case 1:
            dayName = "Monday";
            break;
        case 2:
            dayName = "Tuesday";
            break;
        case 3:
            dayName = "Wedneday";
            break;
        case 4:
            dayName = "Thursday";
            break;
        case 5:
            dayName = "Friday";
            break;
        case 6:
            dayName = "Saturday";
            break;
        default:
            dayName = "Invalid day";
            break;
            }

      System.out.println("Today is " + dayName);
  }

  
}
