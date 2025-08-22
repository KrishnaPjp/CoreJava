package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        while (true) {
            System.out.println("How many name do you want to enter");
            int count = sc.nextInt();
            sc.nextLine();

            if (count == 0) {
                System.out.println("Exiting program...");
                break;
            }

            for (int i = 1; i <= count; i++) {
                System.out.println("Enter name " + i);
                String str = sc.nextLine();
                name.add(str);

            }
            System.out.println("All Name ");
            for (String n : name) {
                System.out.println(n);

            }
            System.out.print("Enter index to remove  ");
            int index = sc.nextInt();
            if (index >= 0 && index < name.size()) {
                name.remove(index);
            } else {
                System.out.println("Invalid index ");
            }


            System.out.println("Names after removal ");
            for (String n : name) {
                System.out.println(n);
            }
            System.out.println("Enter 0 exit");

//        name.add("Krishna");
//        name.add("Ravi ");
//        System.out.println(name);
        }
    }
}