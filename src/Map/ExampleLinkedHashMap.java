package Map;

import java.util.LinkedHashMap;
//When you want a Map that preserves insertion order.
//Useful in caching scenarios (especially with access-order enabled).
//Example: LRU Cache implementation.
public class ExampleLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> fruits = new LinkedHashMap<>();
        fruits.put(1, "Apple");
        fruits.put(2, "Banana");
        fruits.put(3, "Cherry");
        fruits.put(4, "Date");

        System.out.println("Initial LinkedHashMap " + fruits);

    }
}
