package Project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Order> orders = new ArrayList<>();

        while (true) {
            try {
                System.out.println("Enter customer name (or type 'exit' to finish):");
                String name = sc.nextLine();
                if (name.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.println("Is member? (true/false):");
                boolean isMember = sc.nextBoolean();
                sc.nextLine();

                String memberType = "";
                if (isMember) {
                    System.out.println("Enter membership type (Gold/Silver/Premium):");
                    memberType = sc.nextLine();
                }

                Customer customer = new Customer(name, isMember, memberType);

                System.out.println("Enter pizza cost for " + name + ":");
                double pizzaCost = sc.nextDouble();

                System.out.println("Enter drink cost for " + name + ":");
                double drinkCost = sc.nextDouble();
                sc.nextLine(); // consume newline

                // Create Order
                Order order = new Order(customer, LocalDate.now());
                order.setPizzaCost(pizzaCost);
                order.setDrinkCost(drinkCost);

                // Add order to list
                orders.add(order);

            } catch (Exception e) {
                GlobalExceptionHandler.handle(e);
                sc.nextLine(); // clear buffer
            }
        }

        System.out.println("\nOrder Summary:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
