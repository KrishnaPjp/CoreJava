package AddCoustmor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();

        System.out.print("How many customers do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for Customer" + i );
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            Customer c = new Customer(id, name);
            customers.add(c);
        }

        System.out.println(" All Customers ");
        for (Customer c : customers) {
            System.out.println(c);
        }


    }
}




