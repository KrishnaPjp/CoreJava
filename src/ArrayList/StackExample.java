package ArrayList;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();

        // Push elements
        books.push("Python");
        books.push("C++");
        books.push("Java");

        System.out.println("Stack: " + books);

        // Peek top
        System.out.println("Top element: " + books.peek());

        // Pop top
        System.out.println("Popped: " + books.pop());

        System.out.println("Stack after pop: " + books);

        // Check empty
        System.out.println("Is empty? " + books.isEmpty());
    }
}
