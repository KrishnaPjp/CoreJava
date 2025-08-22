package office;

import java.awt.*;
import java.util.Scanner;

public class Plindrome {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String value ");
            String str = sc.nextLine();
            String lower = str.toLowerCase();
            String reverse = "";
            for (int i = lower.length() - 1; i >= 0; i--) {
                reverse = reverse + lower.charAt(i);


            }
            System.out.println("Reverse " + reverse);
            if (lower.equals(reverse)) {
                System.out.println("Polindrom ");
            } else {
                System.out.println("Not polindrome");
            }
        }

    }
    }

