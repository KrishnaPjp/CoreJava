package Comparator;

import ComparableAndComparator.Emp;

import java.util.ArrayList;
import java.util.Collections;

public class DemoSortExample {
    public static void main(String[] args) {
        ArrayList<EmpComparator> emps = new ArrayList<>();
        emps.add(new EmpComparator("Krishna", "89562", 85));
        emps.add(new EmpComparator("Ratan", "664642", 89));
        emps.add(new EmpComparator("Ravi", "32671", 74));
        System.out.println(emps);
        Collections.sort(emps ,new IdCoparator());

        System.out.println(emps);

     //   ArrayList<EmpComparator> emps = new ArrayList<>();
        Collections.sort(emps,new NameComparator());
        System.out.println("Sorting by name "+emps);

    }
}
