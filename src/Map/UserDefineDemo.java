package Map;

import java.util.Scanner;
import java.util.TreeMap;

public class UserDefineDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer,String> map = new TreeMap<>();
        System.out.println("How many entered the value ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.println("Enter key value "+(i+1));
            int key = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter String value "+(i+1));
            String value = sc.nextLine();

        map.put(key,value);

        }
        System.out.println(map);
        System.out.println("Enter the key for remove");
        int a=sc.nextInt();
       map.remove(a);
        System.out.println(map);


//        System.out.println("Add the value");
//        System.out.println("Enter the key of key");
//        int key = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter the String value of key");
//        String value = sc.nextLine();
//        System.out.println("Enter the 2 key of key");
//        int key1 = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter the 2String value of key");
//        String value2 = sc.nextLine();
//        System.out.println("Enter the 3key of key");
//        int key3 = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter the 3String value of key");
//        String value3= sc.nextLine();
//        map.put(key,value);
//        map.put(key1,value2);
//        map.put(key3,value3);

//        System.out.println("Added sucess.."+map);
//        System.out.println(map.get(1));
//        System.out.println(map.remove(2));
    }
}
