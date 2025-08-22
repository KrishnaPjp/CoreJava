package NewStudentManagementSystem;

import java.util.Comparator;

public class StudentAge implements Comparator<NewStudent> {
    @Override
    public int compare(NewStudent o1, NewStudent o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}
