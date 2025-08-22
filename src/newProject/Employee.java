package newProject;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;
import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    public static void main(String[] args) throws IOException {


            String filepath = "F:\\Bluethink.csv";

            List<EmployeeMethod1> cvsList = new BufferedReader(new FileReader(filepath))

                    .lines()

                    .skip(1)

                    .map(line -> {

                        String[] data = line.split(",");

                        return new EmployeeMethod1(

                                Integer.parseInt(data[0]),

                                data[1],

                                data[2],

                                Double.parseDouble(data[3])

                        );

                    })

                    .collect(Collectors.toList());



            System.out.println("Sorted by Salary:");

            cvsList.stream()

                    .sorted(Comparator.comparing(EmployeeMethod1::getSalary))

                    .forEach(System.out::println);

        System.out.println("Sorted by Name ");
        cvsList.stream().sorted(Comparator.comparing(EmployeeMethod1::getName)).forEach(System.out::println);
       // cvsList.stream().sorted().forEach(System.out::println);
        double SalaryAverge = cvsList.stream().mapToDouble(EmployeeMethod1::getSalary).average().orElse(0.0);
        System.out.println("Averge "+SalaryAverge);
        System.out.println("Sorted by salary ");
        cvsList.stream().sorted(Comparator.comparing(EmployeeMethod1::getSalary).reversed()).limit(3).forEach(System.out::println);
        EmployeeMethod1 Highest = cvsList.stream().max(Comparator.comparing(EmployeeMethod1::getSalary)).orElse(null);
        System.out.println("Highest "+Highest);
        LocalDate date =LocalDate.now();
        LocalTime time =LocalTime.now();
        System.out.println("Date "+date);
        System.out.println("Time "+time);


        }
    }



