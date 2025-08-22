package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class DemoAllComand {
    public static void main(String[] args) {
        try{
            File f = new File("F:\\Abhinav.txt");
            if(f.createNewFile()){
                System.out.println("File created..");
            }else {
                System.out.println("Already exits..");
            }

            FileWriter fr =new FileWriter(f,true);
            System.out.println();
            fr.write(" \n Hi am living in London");
            System.out.println("Written successfully..");
            fr.close();

            Scanner sc =new Scanner(f);
            System.out.println("Reading file");
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }

//            if(f.delete()){
//                System.out.println("file deleted "+f.getName());
//            }else {
//                System.out.println("Filre not exits..");
//            }
//
       } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
