package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class DemoBufferWriter {
    public static void main(String[] args) {
        try {

        File f = new File("F:\\Bluethink.csv");
             FileWriter wrter = new FileWriter(f);
            BufferedWriter br = new BufferedWriter(wrter);
        br.write("How are you krishna ");
        br.newLine();
        br.write("Its fater then write");
       br.close();
            System.out.println("Written successfully..");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
