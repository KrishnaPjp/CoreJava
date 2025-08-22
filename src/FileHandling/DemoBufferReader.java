package FileHandling;
import java.io.*;
public class DemoBufferReader {

                public static void main(String[] args) {
                    try {
                        String filePath = "F:\\Abhinav.txt";

                        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                            String line ;
                            System.out.println("Reading file ");
                            while ((line = br.readLine()) != null) {
                                System.out.println(line);
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }


    }

