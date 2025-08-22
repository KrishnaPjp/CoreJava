package Map;
import  java.util.*;
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();


        map.put(3, "Banana");
        map.put(1, "Apple");
        map.put(4, "Date");
        map.put(2, "Cherry");

        System.out.println("TreeMap: " + map);
    }
}
