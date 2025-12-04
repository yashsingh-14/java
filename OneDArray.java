// class OneDArray{
//  public static void main(String[] args) {
//         int[] numbers;           // Declaration
//         numbers = new int[5]; // Allocation (5 elements)

//         // int[] numbers = new int[5];    // Declaring and Intializing at same time.
        
//         // int[] numbers = {10, 20, 30, 40, 50};  // Declaring and Assigning values at same time.

//         // Assigning values
//         numbers[0] = 10;
//         numbers[1] = 20;
//         numbers[2] = 30;
//         numbers[3] = 40;
//         numbers[4] = 50;

//         System.out.println("Accessing Through Index:");
//         System.out.println(numbers[2]);  // Output: 30
//         System.out.println("=====================");
        

//         System.out.println("Accessing Through For-Loop:");
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.println("Element at index " + i + " is " + numbers[i]);
//         }
//         System.out.println("=====================");
        
//         System.out.println("Accessing Through Enchanced For-Loop:");
//         for (int num : numbers) {
//             System.out.println(num);
//         }
//         System.out.println("=====================");
        
//         System.out.println("Accessing Array of String:");
//         String[] names = { "Alice", "Bob", "Charlie" };

//         for (String name : names) {
//             System.out.println(name);
//         }
//     }
// }

public class OneDArray {

    public static void main(String[] args) {
        int [] number;
        number = new int[5];

        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;

        System.out.println(number[2]);

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        for (int num : number) {
            System.out.println(num);
        }

        // Fixed
        String[] names = {"Alice", "Bob", "Charlie"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
