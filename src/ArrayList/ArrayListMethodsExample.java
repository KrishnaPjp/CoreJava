package ArrayList;
import java.util.*;
//import java.util.ArrayList;
//import java.util.Arrays;

public class ArrayListMethodsExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Krishna");
        list.add("Ravi");
        list.add("Amit");

        // Insert at index
        list.add(1, "Sita");

        // Display all
        System.out.println("List: " + list);

        // Get and Set
        System.out.println("Element at 0: " + list.get(0));
        list.set(0, "Radha");

        // Remove
        list.remove("Amit");

        // Check contains
        System.out.println("Contains Ravi? " + list.contains("Ravi"));

        // Index
        System.out.println("Index of Sita: " + list.indexOf("Sita"));

        // Size and Empty
        System.out.println("Size: " + list.size());
        System.out.println("Is Empty? " + list.isEmpty());

        // Sublist
        System.out.println("Sublist: " + list.subList(0, 2));

        // Convert to array
        Object[] arr = list.toArray();
        System.out.println("Array: " + Arrays.toString(arr));



        // Clear
        list.clear();
        System.out.println("After clear: " + list);
    }
}
