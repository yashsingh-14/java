package Multithreading.LIST;

import java.util.ArrayList;
import java.util.List;

public class AvengerListExample {
    
    public static void main(String[] args) {
        // create a list of Avengers
        List<String> avengers = new ArrayList<>();
        // 1. add(element)-Adding elements
        avengers.add("Iron man");
        avengers.add("Captian America");
        avengers.add("Thor");
        avengers.add("Hulk");
        avengers.add("Black Widow");
        System.out.println("Avengers:"+avengers);
        //2.get(index) - Getting Element at index 2
        System.out.println("Element at index 2:"+ avengers.get(2));

        //3. set(index,element) - Replacing elements at index 3
        avengers.set(3,"Hawkeye");
        System.out.println("After set:"+avengers);
        //4. remove(index) - Removing elements at index 1
        avengers.remove(1);
        System.out.println("After remove:"+avengers);

    //5. size() - Getting number of elements
        System.out.println("Number of Avengers:"+avengers.size());

        // 6. contains(elements) - Checking if "Iron man" exists
        System.out.println("Contains Iron man?"+ avengers.contains("Iron Man"));

        //7. clear()-clearing the entire list
        //avengers.clear();
        System.out.println("After clear:"+ avengers);

        //1. Using a traditional for loop
        System.out.println("\nAccess using traditional for loop:");
        for (int i=0;i<avengers.size();i++){
            System.out.println("Avengers at index"+i+":"+avengers.get(i));
        }
        // 2. Using an enhanced for - each loop
        System.out.println("\nAccess using for-each loop");
        for(String avenger:avengers){
            System.out.println(avenger);
        }
    }
}
