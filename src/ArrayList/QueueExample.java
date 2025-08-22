package ArrayList;
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Krishna");
        queue.offer("Ravi");
        queue.offer("Amit");

        System.out.println("Queue: " + queue); // [Krishna, Ravi, Amit]

        System.out.println("Head (peek): " + queue.peek()); // Krishna

        System.out.println("Removed: " + queue.poll()); // Krishna
        System.out.println("Queue after removal: " + queue); // [Ravi, Amit]
    }
}
