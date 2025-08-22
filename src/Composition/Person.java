package Composition;

public class Person {
    private Brain brain;

    Person() {
        brain = new Brain();
    }

    void work() {
        brain.think();
        System.out.println("Person is working...");
    }
}
