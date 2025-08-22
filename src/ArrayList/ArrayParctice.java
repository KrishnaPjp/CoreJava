package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayParctice {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Krishna ");
        name.add("ravi ");
        name.add("Ratan ");
        name.add("Raju ");
        name.remove(1);
        name.indexOf("Raju");
        name.add(2,"Ramesh");

     System.out.println("All the name "+name);
       /* Iterator <String> itr=name.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());*/
        }
    }

