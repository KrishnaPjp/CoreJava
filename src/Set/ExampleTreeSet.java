package Set;

import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(40);
        set.add(45);
        set.add(35);
        set.add(85);

        set.remove(35);
        System.out.println(set.contains(45));
        System.out.println(set);

    }
}
