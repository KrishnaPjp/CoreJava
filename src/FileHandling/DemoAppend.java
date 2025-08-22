package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class DemoAppend {
    public static void main(String[] args) {
        try

    {
        File f = new File("F:\\Bluethink");
        FileWriter writer = new FileWriter(f, true);
        writer.write("\n Hi I am Krishna");
        writer.close();
        System.out.println("Append Successfull..");


    }catch(Exception e){
            System.out.println("Somthing wrong..");

    }
    }
}
