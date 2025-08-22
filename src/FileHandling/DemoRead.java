package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoRead {
    public static void main(String[] args) {
        try {
            File f = new File("F:\\Abhinav.txt");
            Scanner sc = new Scanner(f);
            System.out.println("Reading the file context");

            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
