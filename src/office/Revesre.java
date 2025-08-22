package office;

import java.util.Scanner;

public class Revesre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String value");
        String str = sc.nextLine();
        System.out.println("OutPut "+str);
        StringBuffer br = new StringBuffer(str);
        System.out.println("Reverse value :"+br.reverse());
       if (str.equals(br)){
           System.out.println("not");
       }else {
           System.out.println("Polindromr");
       }

        }
    }
