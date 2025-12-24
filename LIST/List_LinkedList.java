package LIST;

import java.util.*;

public class List_LinkedList {
    public static void main(String[] args) {

        // Create ArrayList of Avengers
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Iron Man");
        arrayList.add("Captain America");
        arrayList.add("Thor");

        // Create LinkedList of Avengers
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Iron Man");
        linkedList.add("Captain America");
        linkedList.add("Thor");

        // Access element at index 1
        System.out.println("ArrayList element at index 1: " + arrayList.get(1)); // Fast
        System.out.println("LinkedList element at index 1: " + linkedList.get(1)); // Slower

        // Insert in the middle
        arrayList.add(1, "Hulk"); // Shifts elements in ArrayList
        linkedList.add(1, "Hulk"); // Adjusts links in LinkedList

        System.out.println("After insert (ArrayList): " + arrayList);
        System.out.println("After insert (LinkedList): " + linkedList);

        // Optional: Loop through lists to show all elements
        System.out.println("\nIterating ArrayList:");
        for (String avenger : arrayList) {
            System.out.println(avenger);
        }

        System.out.println("\nIterating LinkedList:");
        for (String avenger : linkedList) {
            System.out.println(avenger);
        }
    }
}