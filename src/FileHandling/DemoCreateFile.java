package FileHandling;

import java.io.File;

public class DemoCreateFile {
    public static void main(String[] args) {

      try {

          File f = new File("F:\\Nitesh.txt");
          if(f.createNewFile()){
              System.out.println("File craete "+f.getName());

          }else {
              System.out.println("File Alredy creted.");
          }

      } catch (Exception e) {
          System.out.println("File not found");
      }
    }
}