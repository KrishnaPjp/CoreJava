package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AllCommand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\nChoose an option:");
                System.out.println("1. Create a File");
                System.out.println("2. Write in a File");
                System.out.println("3. Read a File");
                System.out.println("4. Delete a File");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice == 1) {
                    System.out.print("Enter file path to create ( F:\\MyFile.txt): ");
                    String filePath = sc.nextLine();

                    File file = new File(filePath);
                    if (file.createNewFile()) {
                        System.out.println("File created: " + file.getName());
                    } else {
                        System.out.println("File already exists.");
                    }

                } else if (choice == 2) {
                    System.out.print("Enter file path to write: ");
                    String filePath = sc.nextLine();

                    System.out.print("Enter text to write: ");
                    String content = sc.nextLine();


                    System.out.print("Append to file? (true/false): ");
                    boolean append = sc.nextBoolean();
                    sc.nextLine();

                    try (FileWriter writer = new FileWriter(filePath, append)) {
                        writer.write(content + " ");
                        System.out.println("Data written successfully.");
                    }

                } else if (choice == 3) {
                    System.out.print("Enter file path to read: ");
                    String filePath = sc.nextLine();

                    File file = new File(filePath);
                    if (file.exists()) {
                        Scanner reader = new Scanner(file);
                        System.out.println("\nFile Content:");
                        while (reader.hasNextLine()) {
                            System.out.println(reader.nextLine());
                        }
                        reader.close();
                    } else {
                        System.out.println("File does not exist.");
                    }

                } else if (choice == 4) {
                    System.out.print("Enter file path to delete: ");
                    String filePath = sc.nextLine();

                    File file = new File(filePath);
                    if (file.delete()) {
                        System.out.println("File deleted: " + file.getName());
                    } else {
                        System.out.println("Failed to delete file or file not found.");
                    }

                } else if (choice == 5) {
                    System.out.println("Exiting program...");
                    break;
                } else {
                    System.out.println("Invalid choice. Try again.");
                }

            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
        sc.close();
    }
}
