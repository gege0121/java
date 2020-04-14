import java.util.Comparator;

public class SalaryComparator implements Comparator<People> {

    public int compare(People p1, People p2) {
        return p1.getSalary()-p2.getSalary();
//            if (p1.getSalary()<p2.getSalary()) return -1;
//            if(p1.getSalary()>p2.getSalary()) return 1;
//            else return 0;
    }


}
