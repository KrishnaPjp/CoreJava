package NewStudentManagementSystem;

import Compretor.EmplyeeShort;
import Compretor.NameCoampare;
import Set.HashSet;

import java.util.*;


public class StudentInfo {
    public static void main(String[] args) {
        ArrayList<NewStudent> student = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("How many student you want to add");
        int n = sc.nextInt();
       /* for (int i =0;i<n;i++) {
            System.out.println(i + 1);*/

        int i=0;
        while (i<n){
            System.out.println(n+1);
            i++;

            System.out.println("Enter student Id");
            int id = sc.nextInt();

            System.out.println("Enter Student name");
            String name = sc.nextLine();
            sc.nextLine();
            String lower =name.toLowerCase();

            System.out.println("Ented student age");
            int age = sc.nextInt();

            System.out.println("Entered student marks");
            int marks = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Student city");
            String city = sc.nextLine();

            student.add(new NewStudent(id,name,age,marks,city));


        }
//        int i =0;
//        while (i<n){
//
//            i++;
//      }
//            System.out.println();


        System.out.println(student);
        Collections.sort(student,new StudentName());
        System.out.println("Sorting by Name "+student);


        Collections.sort(student,new StudentAge());
        System.out.println("Sorting by Age "+student);


        Collections.sort(student,new StudentMarks());
        System.out.println("Sorting by Marks "+student);

        System.out.println(student);

        System.out.println(student);

        Map<Integer, String> idCityMap = new HashMap<>();

        for (NewStudent s : student) {
            idCityMap.put(s.getId(), s.getCity());
        }

        System.out.println("\nStudent ID and City:");
        for (Map.Entry<Integer, String> entry : idCityMap.entrySet()) {
            System.out.println("ID " + entry.getKey() + " City " + entry.getValue());
        }

        System.out.println("which value you want to delete enter the index number");
        int index = sc.nextInt();
        student.remove(index);
        System.out.println(student);

    }
}