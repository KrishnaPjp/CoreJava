package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class DemoWriteFile {
    public static void main(String[] args) {

    try{
        File f = new File("F:\\Bluethink.txt");
        FileWriter wf = new FileWriter(f,true);

        wf.write("/n Hi i am Krishna");
        System.out.println("Written success..");
        wf.close();

    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    }
}
