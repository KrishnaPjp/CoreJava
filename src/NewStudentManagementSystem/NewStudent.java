package NewStudentManagementSystem;
//Task: Student Management System (Console Based)
//Problem Statement:
//Build a console-based Student Management System where you can:
//Add a student
//Delete a student by ID
//Find a student by name
//Sort students by:
//Name,Age,Marks
//List all students without duplicates
//Group students by city
public class NewStudent {
   private int id;
    private String name;
    private int age;
    private int marks;
    private String city;
    public NewStudent(int id,String name, int age, int marks,String city) {
        this.id=id;
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.city=city;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setMarks(int marks) {
        this.marks = marks;

    }

    @Override
    public String toString() {
        return "NewStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                ", city='" + city + '\'' +
                '}';
    }
}
