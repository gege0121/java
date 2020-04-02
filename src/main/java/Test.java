import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args){
        ArrayList<People> list = new ArrayList<People>();
        //  People GG = new People();
        list.add(new People("gg", 100, 25));
        list.add(new People("WW", 120, 33));
        list.add(new People("oo", 10, 28));

        List<People> result=list.stream().filter(e->!"gg".equals(e.getName())).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(result);

        String xxx="apple";
        System.out.println(xxx);

//        Predicate<People> isQualified = people -> people.isQualified();
//
//
//        list.stream().filter(isQualified).forEach(item -> item.getAge());
//
//       // list.removeIf(isQualified);
//        Collections.sort(list);
//
//        System.out.println("people after sorting : ");
//        for(People people: list)
//        {
//            System.out.println(people.getName() + " " +
//                    people.getAge() + " " +
//                    people.getSalary());
//        }
//
//        System.out.println("Sorted by salary");
//        SalaryComparator salaryCompare = new SalaryComparator();
//        Collections.sort(list, salaryCompare);
//        for (People people: list)
//            System.out.println(people.getName() + " " +
//                    people.getSalary() + " " +
//                    people.getAge());
//
//        System.out.println("Sorted by age");
//        AgeComparator ageComparator = new AgeComparator();
//        Collections.sort(list, ageComparator);
//        for (People people: list)
//            System.out.println(people.getName() + " " +
//                    people.getSalary() + " " +
//                    people.getAge());

        //? not salarycomparator class
        //ascending order
//        Comparator<People> salaryComparator = (o1, o2)->o1.getSalary()-(o2.getSalary());
//       list.sort(salaryComparator);
//
//       List<People> sortedSalaryPeople=list.stream().sorted(salaryComparator).collect(Collectors.toList());
//
//        Comparator<People> ageComparator = (o1, o2)->o1.getAge().compareTo(o2.getAge());
//        list.sort(ageComparator);
//
//        List<People> soeredSalaryagePeople=sortedSalaryPeople.stream().sorted(ageComparator).collect(Collectors.toList());
//

//        //descending
//        Comparator<People> salaryComparator = (o1, o2)->o1.getSalary().compareTo(o2.getSalary());
//        list.sort(salaryComparator.reversed());



    }
}
