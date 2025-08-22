package StaticKeyword;
//A static method belongs to the class, not to objects.
//You can call it without creating an object
public class ExampleMethod {
    static void display(){
        System.out.println("Hi my name is method");
    }

    public static void main(String[] args) {
        ExampleMethod.display();
    }
}
