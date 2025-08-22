package Project;

public class GlobalExceptionHandler {
    public static void handle(Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
