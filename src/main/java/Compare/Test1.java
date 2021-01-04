package Compare;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args){
        //instance
        People a=new People("gg",123, 55);
        People b=new People("ww",21, 54);
        People c=new People("cc",55,90);

        AgeComparator ageComparator=new AgeComparator();
        int d=ageComparator.compare(a,b);
        System.out.println(d);

        //people里面定义了
        int e=a.compareTo(b);
        System.out.println(e);

        //用lambda expression来写comparator比较
        Comparator<People> age1comparator=(People p1,People p2)->(int)(p1.getAge()-p2.getAge());
        Comparator<People> age2compare=(People p1, People p2)->p1.getAge().compareTo(p2.getAge());


        //list存people
        List<People> list=new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        //sort
        list.sort(age1comparator);
        list.sort(age1comparator.reversed());
//        list.forEach(people -> System.out.println(people));

        //filter: 只留下满足条件的
        List<People> r1=list.stream().filter(p->p.getAge()==55).collect(Collectors.toList());
        System.out.println(r1);

        //map: 给一个object，得到object.attribute()
        List<String> r2=list.stream().map(p->p.getName()).collect(Collectors.toList());
        System.out.println(r2);

        //取字段用"，"分开
        String joind=list.stream().map(p->p.getName()).collect(Collectors.joining("."));
        System.out.println(joind);

        //toMap: list<People> 转map<name,people>
        Map<String,People> map=list.stream().collect(Collectors.toMap(People::getName,p->p,(k1,k2)->k1));
        map.forEach((k,v)->System.out.println("Name : " + k + " Info : " + v));

        //map<name,people> 存List<people>
        //value
        List<People> l1=map.values().stream().collect(Collectors.toList());
        l1.forEach(i->System.out.println(i));

        //key
        List<String> l2=map.keySet().stream().collect(Collectors.toList());
        l2.forEach(i->System.out.println(i));

        //entryset
        List<Object> l3=map.entrySet().stream().map(er->er.getKey()+" "+er.getValue()).collect(Collectors.toList());
        l3.forEach(i->System.out.println(i));


        Map<String, String> m = new HashMap<String, String>();
        m.put("Hello", "World");
        m.put("Apple", "3.14");
        m.put("Another", "Element");


        List<String> listkey = new ArrayList<String>(m.keySet());
        List<String> listvalue = new ArrayList<String>(m.values());

    }
}
