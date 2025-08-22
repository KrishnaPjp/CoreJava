package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Dserial {
    public static void main(String[] args) {
        try {

            FileInputStream fis = new FileInputStream("F:\\ob.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Student student=(Student)ois.readObject();

            student.displayName();
            System.out.println(student.getName());
            System.out.println(student.getEmail());
            System.out.println(student.getAge());
            System.out.println(student.getAddress());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
