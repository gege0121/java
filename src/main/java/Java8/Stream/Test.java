package Java8.Stream;

import Compare.People;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args){
        ArrayList<People> list = new ArrayList<People>();
        //  Compare.People GG = new Compare.People();
        list.add(new People("gg", 100, 25));
        list.add(new People("WW", 120, 33));
        list.add(new People("oo", 10, 28));

        List<People> result=list.stream().filter(e->!"gg".equals(e.getName())).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(result);

        String xxx="apple";
        System.out.println(xxx);

//        Predicate<Compare.People> isQualified = people -> people.isQualified();
//
//
//        list.stream().filter(isQualified).forEach(item -> item.getAge());
//
//       // list.removeIf(isQualified);
//        Collections.sort(list);
//
//        System.out.println("people after sorting : ");
//        for(Compare.People people: list)
//        {
//            System.out.println(people.getName() + " " +
//                    people.getAge() + " " +
//                    people.getSalary());
//        }
//
//        System.out.println("Sorted by salary");
//        Compare.SalaryComparator salaryCompare = new Compare.SalaryComparator();
//        Collections.sort(list, salaryCompare);
//        for (Compare.People people: list)
//            System.out.println(people.getName() + " " +
//                    people.getSalary() + " " +
//                    people.getAge());
//
//        System.out.println("Sorted by age");
//        Compare.AgeComparator ageComparator = new Compare.AgeComparator();
//        Collections.sort(list, ageComparator);
//        for (Compare.People people: list)
//            System.out.println(people.getName() + " " +
//                    people.getSalary() + " " +
//                    people.getAge());

        //? not salarycomparator class
        //ascending order
//        Comparator<Compare.People> salaryComparator = (o1, o2)->o1.getSalary()-(o2.getSalary());
//       list.sort(salaryComparator);
//
//       List<Compare.People> sortedSalaryPeople=list.stream().sorted(salaryComparator).collect(Collectors.toList());
//
//        Comparator<Compare.People> ageComparator = (o1, o2)->o1.getAge().compareTo(o2.getAge());
//        list.sort(ageComparator);
//
//        List<Compare.People> soeredSalaryagePeople=sortedSalaryPeople.stream().sorted(ageComparator).collect(Collectors.toList());
//

//        //descending
//        Comparator<Compare.People> salaryComparator = (o1, o2)->o1.getSalary().compareTo(o2.getSalary());
//        list.sort(salaryComparator.reversed());



    }
}
