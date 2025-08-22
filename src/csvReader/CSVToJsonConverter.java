//package csvReader;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.SerializationFeature;
//
//import java.io.*;
//import java.util.*;
//
//public class CSVToJsonConverter {
//    public static void main(String[] args) {
//        String csvFile = "students.csv";   // Input CSV
//        String jsonFile = "students.json"; // Output JSON file
//        String line;
//        List<Student> students = new ArrayList<>();
//
//        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//            br.readLine(); // Skip header line
//
//            while ((line = br.readLine()) != null) {
//                String[] data = line.split(",");
//
//                if (data.length < 3) continue; // skip invalid lines
//
//                int id = Integer.parseInt(data[0].trim());
//                String name = data[1].trim();
//                int age = Integer.parseInt(data[2].trim());
//
//                Student student = new Student(id, name, age);
//                students.add(student);
//            }
//
//            /
//            ObjectMapper mapper = new ObjectMapper();
//            mapper.enable(SerializationFeature.INDENT_OUTPUT); // Pretty print
//
//            // Save to file
//            mapper.writeValue(new File(jsonFile), students);
//
//            // Print JSON to console
//            String jsonResult = mapper.writeValueAsString(students);
//            System.out.println(jsonResult);
//
//            System.out.println(" JSON file created successfully: " + jsonFile);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
