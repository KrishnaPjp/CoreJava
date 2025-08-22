package FileHandling;

import java.io.File;

public class DemoDelete {
    public static void main(String[] args) {
        try{
            File f =new File("F:\\Sonia.txt");
            if(f.delete()){
                System.out.println("Deleted"+f.getName());

            }else {
                System.out.println("Not file exits");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
