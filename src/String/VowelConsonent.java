package String;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        int vowel=0;
        int consonent =0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The character ");
        String str = sc.nextLine();
        str=str.toLowerCase();
        for (int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch >='a'&&ch<='z'){
                if(ch == 'a'||ch =='e'||ch == 'i'||ch == 'o'||ch =='u'){
                    vowel++;

                }
                else {
                    consonent++;
                }

            }

        }
        System.out.println("Vowel "+vowel);
        System.out.println("Vowel "+consonent);


    }
}
