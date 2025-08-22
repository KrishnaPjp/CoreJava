package NewComaprable;

import java.util.ArrayList;
import java.util.Collections;

public class BlueThinkInfo {
    public static void main(String[] args) {

        ArrayList<BlueThink> blueThinks = new ArrayList<>();
        blueThinks.add(new BlueThink(5, "Krishna", "Delhi"));
       blueThinks.add(new BlueThink(4, "Ravi", "Noida"));
       blueThinks.add(new BlueThink(3, "Deepak", "Ghaziabad"));

        System.out.println(blueThinks);

        Collections.sort(blueThinks);
        System.out.println("After Sorting "+blueThinks);
    }
}
