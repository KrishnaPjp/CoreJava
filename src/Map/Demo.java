package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Object, Object> map = new TreeMap<>();
        map.put(1,"Prajapti");
        map.put(2,"Singh");
        map.put(5,"Rajesh");
        map.put(4,"Raju");
        System.out.println(map);
        System.out.println(map.containsKey(4));


    }

}
