package Serialization;

import java.io.FileOutputStream;

public class EmplyeeSerial {
    public static void main(String[] args) {
        try {
            Emplyee e = new Emplyee(12,"Krishna","Delhi");

            FileOutputStream fos = new FileOutputStream("F:\\dos.txt");


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
