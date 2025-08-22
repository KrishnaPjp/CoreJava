package Set;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(10);
        set.add(40);
        set.add(30);
        System.out.println(set);

    }
}
