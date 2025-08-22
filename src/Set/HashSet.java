package Set;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<Integer> set = new java.util.HashSet<>();
        set.add(25);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(5);
        set.add(8);

        System.out.println(set);

    }
}
