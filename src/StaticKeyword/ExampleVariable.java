package StaticKeyword;
//static Variable (Class variable)
//A static variable is shared by all objects of a class
public class ExampleVariable {
    int id;
    String name;
    static String college = "ITM";

    ExampleVariable(int id, String name) {
        this.id = id;
        this.name = name;
    }
        void display () {
            System.out.println(id + " " + name + " " + college);

        }

    }

