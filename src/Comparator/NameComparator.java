package Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<EmpComparator> {

    @Override
    public int compare(EmpComparator o1, EmpComparator o2) {

        return o1.getName().compareTo(o2.getName());
    }
}
