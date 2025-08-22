package NewStudentManagementSystem;

import java.util.Comparator;

public class StudentName implements Comparator<NewStudent> {

    @Override
    public int compare(NewStudent o1, NewStudent o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
