package csvReader;

import java.io.*;
import java.util.*;

public class ReadAnWrite {
    public static void main(String[] args) {
        String inputPath = "F:\\studentManagement.csv";
        String outputPath = "F:\\output14.json";

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputPath));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))
        ) {
            String headerLine = br.readLine();
            if (headerLine == null) {
                System.out.println("Empty CSV file.");
                return;
            }

            String[] headers = headerLine.split(",");
            List<Map<String, String>> jsonList = new ArrayList<>();

            // Read and convert each row into a Map (like JSON object)
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Map<String, String> obj = new LinkedHashMap<>();
                for (int i = 0; i < headers.length; i++) {
                    obj.put(headers[i], i < values.length ? values[i] : "");
                }
                jsonList.add(obj);
            }
            bw.write(jsonList.toString());
            // Write headers to output.csv
//            bw.write(String.join(",", headers));
//            bw.newLine();

            //Write each map (converted from JSON) as a CSV row
//            for (Map<String, String> obj : jsonList) {
//                List<String> row = new ArrayList<>();
//                for (String header : headers) {
//                    row.add(obj.get(header));
//                }
//                bw.write(String.join(",", row));
//                bw.newLine();
//            }

            System.out.println(" JSON converted : " + outputPath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
