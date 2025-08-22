package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Krishna","89562",85));
        emps.add(new Emp("Ratan","664642",89));
        emps.add(new Emp("Ravi","32671",74));
        System.out.println(emps);
        Collections.sort(emps);

        //Compare
        System.out.println(emps);
           }
}
