class OneDArray{
 public static void main(String[] args) {
        int[] numbers;           // Declaration
        numbers = new int[5]; // Allocation (5 elements)

        // int[] numbers = new int[5];    // Declaring and Intializing at same time.
        
        // int[] numbers = {10, 20, 30, 40, 50};  // Declaring and Assigning values at same time.

        // Assigning values
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println("Accessing Through Index:");
        System.out.println(numbers[2]);  // Output: 30
        System.out.println("=====================");
        

        System.out.println("Accessing Through For-Loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " is " + numbers[i]);
        }
        System.out.println("=====================");
        
        System.out.println("Accessing Through Enchanced For-Loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println("=====================");
        
        System.out.println("Accessing Array of String:");
        String[] names = { "Alice", "Bob", "Charlie" };

        for (String name : names) {
            System.out.println(name);
        }
    }
}