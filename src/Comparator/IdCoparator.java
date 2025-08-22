package Comparator;

import java.util.Comparator;

public class IdCoparator implements Comparator<EmpComparator> {

    @Override
    public int compare(EmpComparator o1, EmpComparator o2) {
        return o1.getEmpId()-o2.getEmpId();

    }
}
