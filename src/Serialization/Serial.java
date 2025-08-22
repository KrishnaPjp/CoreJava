package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {
        try{
            Student student = new Student("Ankit ","ankit@gmail.com ",25,"Noida");

            FileOutputStream fos = new FileOutputStream("F:\\ob.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(student);

            oos.close();
            fos.close();
            System.out.println("object created to transfer to file ob ");


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
