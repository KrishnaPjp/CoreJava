package Aggregation;

public class Person {

    String name = "Krishna";

    Job job = new Job();  // Aggregation (Has-a)

    void showDetails() {
        System.out.println("Name " + name);
        System.out.println("Role " + job.role);
        System.out.println("Salary " + job.salary);
    }
    }

