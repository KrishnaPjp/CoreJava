package String;


import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String reverse = "";
            System.out.println("Enter String value ");
            String str = sc.nextLine();
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse = reverse + str.charAt(i);

            }
            System.out.println("Reverse => "+reverse);
            if (str.equals(reverse)) {
                System.out.println("Plindrome");

            } else {
                System.out.println("Not Polindrome");
            }
        }


    }
