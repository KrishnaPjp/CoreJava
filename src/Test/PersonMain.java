package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many person you want add ");
        int n = sc.nextInt();
        sc.nextLine();
            for(int i=0;i<n;i++){
                System.out.println(i+1);

            System.out.println("Enter person name ");
            String name = sc.nextLine();


            System.out.println("Enter person id");
            int id = sc.nextInt();
                sc.nextLine();

            System.out.println("Enter person address ");
            String address = sc.nextLine();


            p.add(new Person(name, id, address));
          //  p.add(new Person("Ratan", 2, "Noida"));

        }
        System.out.println(p);
    }
}
