package ArrayList;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("Krishna");
        list.add(25);
        list.add(252.6);
        list.add(78.2f);
        list.add('A');

       // System.out.println(list);
        for (Object obj : list) {
            System.out.println(obj + " (" + obj.getClass().getSimpleName() + ")");
        }
    }
}
