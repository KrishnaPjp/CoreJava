package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = "F:\\student.csv";
        File file = new File(filePath);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {

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


            while (true) {
                System.out.print("Enter Name (or type 'exit' to finish): ");
                String name = sc.nextLine();
                if (name.equalsIgnoreCase("exit"))
                    break;

                System.out.print("Enter Roll Number: ");
                String rollNumber = sc.nextLine();

                System.out.print("Enter Address: ");
                String address = sc.nextLine();

                bw.write(name + "," + rollNumber + "," + address);
                bw.newLine();
            }

            System.out.println("CSV file created successfully at: " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
