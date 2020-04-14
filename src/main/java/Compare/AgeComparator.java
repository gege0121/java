package Compare;

import java.util.Comparator;

public class AgeComparator implements Comparator<People> {
    public int compare(People p1, People p2) {
        if (p1.getAge()<p2.getAge()) return -1;
        if(p1.getAge()>p2.getAge()) return 1;
        else return 0;
    }
}
