package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentSorting01 {
    public static void main(String[] args) {
        ArrayList<Student>sub =new ArrayList<>();
        sub.add(new Student(25,"krishna","Delhi"));
        sub.add(new Student(45,"Ratan","Mumbai"));
        sub.add(new Student(12,"Ratan","America"));

        System.out.println(sub);
        Collections.sort(sub);
        System.out.println(sub);
    }
}
