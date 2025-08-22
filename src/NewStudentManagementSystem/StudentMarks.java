package NewStudentManagementSystem;

import java.util.Comparator;

public class StudentMarks implements Comparator<NewStudent> {
    @Override
    public int compare(NewStudent o1, NewStudent o2) {
        return Integer.compare(o1.getMarks(), o2.getMarks());
    }
}
