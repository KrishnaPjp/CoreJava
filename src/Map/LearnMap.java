package Map;
import java.sql.Connection;
import java.util.*;
public class LearnMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("us","India");
        map.put("in","India");
        map.putIfAbsent("in","India2");
        map.put("en","India");
 
       // map.remove("us");
//        Set<String> key = map.keySet();
//        System.out.println(key);

        Collection<String> values = map.values();
        System.out.println(values);
     /*   System.out.println(map.containsKey("in"));
        System.out.println("Contains Values "+map.containsKey("in"));

        System.out.println(map);
        System.out.println(map.get("in"));*/
    }
}
