package StudentManagementSystem;

import java.util.Scanner;

interface ScholarshipEligible {
    boolean isEligible();

    class ScholarStudent extends Student implements ScholarshipEligible {
        private double marks;

        public ScholarStudent(String name, int age, String studentId, String course, double marks) {
            super(name, age, studentId, course);
            this.marks = marks;
        }

        @Override
        public boolean isEligible() {
            return marks >= 85;
        }

        @Override
        public void showDetails() {
            super.showDetails();
            System.out.println("Marks: " + marks);
            System.out.println("Scholarship Eligible: " + isEligible());
        }
    }


    class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Example student
            Student student = new Student("Krishna", 20, "S101", "Java Programming");
            ScholarStudent scholar = new ScholarStudent("Ravi", 22, "S102", "Advanced Java", 90);

            System.out.println("\n Student Info ");
            student.showDetails();

            System.out.println("\n Scholar Student Info ");
            scholar.showDetails();

            System.out.println("\n Show Only ID of Scholar Student ");
            scholar.showDetails(true);
        }
    }
}
