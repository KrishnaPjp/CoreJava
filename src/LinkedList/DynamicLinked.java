package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class DynamicLinked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> name = new LinkedList<>();
        System.out.println("How many name enterd ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=1;i<=n;i++ ){
            System.out.println("Entered "+(i));
            String str = sc.nextLine();
            name.add(str);


        }
        System.out.println("You Entered these name "+name);

        System.out.println("Enter the index for remove");
        int a=sc.nextInt();
        name.remove(a);
        System.out.println(name);


//
//        name.add(str);
//        name.add(str2);
//        name.add(str3);
//
//        System.out.println(name);

    }
}
