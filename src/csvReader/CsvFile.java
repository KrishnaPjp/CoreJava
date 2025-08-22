package csvReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CsvFile {
    public static void main(String[] args) {

        String filePath = "F:\\studentManagement.csv";
        File file = new File(filePath);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

            if (file.length() == 0) {
                bw.write("Name,RollNumber,Address");
                bw.newLine();
            }

            bw.write("Krishna,101,Delhi");
            bw.newLine();
            bw.write("Rahul,102,Mumbai");
            bw.newLine();
            bw.write("Anita,103,Bangalore");
            bw.newLine();




            System.out.println("CSV file created successfully at: " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
