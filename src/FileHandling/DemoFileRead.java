package FileHandling;

import java.io.File;
import java.util.Scanner;

public class DemoFileRead {
    public static void main(String[] args) {
        try{
            File f = new File("F:\\Bluethink.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
  sc.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
