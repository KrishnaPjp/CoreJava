package ArrayList;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NewEmplyee {
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Employee you want to entered ");

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1);


            System.out.println("Enter id ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name ");
            String name = sc.nextLine();

            System.out.println("Enter Salary ");
            int salary = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Department ");
            String Department = sc.nextLine();


            System.out.println("Enter address ");
            String address = sc.nextLine();

            emps.add(new Employee(id, name, salary, Department, address));
//        emps.add(new Employee(3,"Ravi",10000,"Python","Kanpur"));
//        emps.add(new Employee(8,"Ratan",25000,"Dynamic","Gorakhpur"));
//        emps.add(new Employee(6,"Raju",78000,"Magento","Delhi"));
//        emps.add(new Employee(5,"Vikram",136000,"Fronted","Mumbai"));

        }
            //  System.out.println(emps);
            // Collections.sort(emps);
            // Collections.max(emps);
            System.out.println("All Employee "+emps);
            Employee maxidEmp = Collections.max(emps);

            System.out.println("Employee with Maximum Salary ");
            System.out.println(maxidEmp);

    }
}