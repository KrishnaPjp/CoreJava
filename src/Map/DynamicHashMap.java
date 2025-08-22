package Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DynamicHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();

        while (true) {
            System.out.println("===== HashMap Menu =====");
            System.out.println("1. Add Entry");
            System.out.println("2. Remove Entry");
            System.out.println("3. Search by Key");
            System.out.println("4. Search by Value");
            System.out.println("5. Display All Entries");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key (int): ");
                    int key = scanner.nextInt();
                    scanner.nextLine();  // consume newline
                    System.out.print("Enter value (String): ");
                    String value = scanner.nextLine();
                    map.put(key, value);
                    System.out.println("Entry added!");
                    break;

                case 2:
                    System.out.print("Enter key to remove: ");
                    int removeKey = scanner.nextInt();
                    if (map.containsKey(removeKey)) {
                        map.remove(removeKey);
                        System.out.println("Entry removed.");
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter key to search: ");
                    int searchKey = scanner.nextInt();
                    if (map.containsKey(searchKey)) {
                        System.out.println("Value: " + map.get(searchKey));
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;

                case 4:
                    scanner.nextLine();  // consume newline
                    System.out.print("Enter value to search: ");
                    String searchValue = scanner.nextLine();
                    if (map.containsValue(searchValue)) {
                        System.out.println("Value found in the map.");
                    } else {
                        System.out.println("Value not found.");
                    }
                    break;

                case 5:
                    System.out.println("All Entries:");
                    for (Map.Entry<Integer, String> entry : map.entrySet()) {
                        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
