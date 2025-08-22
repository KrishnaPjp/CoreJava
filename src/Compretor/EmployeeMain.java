package Compretor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();


        emp.add(new Employee(1,"Krishna","Delhi",200.0));
        emp.add(new Employee(4,"Aman","noida",1000.0));
        emp.add(new Employee(5,"rajesh ","Kanpur",1002.5));

        System.out.println(emp);
        Collections.sort(emp,new EmplyeeShort());
        System.out.println("Sorting by Salary "+emp);

      //  ArrayList<Employee>emp = new ArrayList<>();
        Collections.sort(emp,new NameCoampare());
        System.out.println("Sorting by name "+emp);
    }
}
