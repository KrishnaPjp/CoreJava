package StudentManagementSystem;

 public class Student extends Person {
    private String studentId;
    private String course;

    public Student(String name, int age, String studentId, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public void showDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }

    // Method Overloading (Polymorphism)
    public void showDetails(boolean showIdOnly) {
        if (showIdOnly) {
            System.out.println("Student ID: " + studentId);
        } else {
            showDetails();
        }
    }
}
