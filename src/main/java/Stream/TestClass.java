package Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class TestClass {
//  1、ID必须是偶数
//2、年龄必须大于23岁
//3、用户名转换为大写
//4、用户名字母倒排序
//5、只输出一个用户

    public static void main(String[] args) {
        User user1 = new User(1, "a", 24,500);
        User user2 = new User(2, "b", 25,600);
        User user4 = new User(4, "d", 24,700);
        User user3 = new User(3, "c", 26,200);
        User user5=new User(5,"e",30,600);
        User user6=new User(6,"f",55,800);
        User user7=new User(7, "g",66,1000);

        List<User> userList = Arrays.asList(user1, user2, user3,user4,user5);
        List<User> usrs=Arrays.asList(user6,user7);

        List<List<User>> uu=Arrays.asList(userList,usrs);

        //use comparable compareTo()
        userList.stream()
                .filter(i->i.getId()%2==0)
                .filter(i->i.getAge()>23)
                .map(i->i.getName().toUpperCase())
                .sorted((i,u)->u.compareTo(i))
                .limit(1)
                .forEach(System.out::println);

        //comparator::compare()
        userList.stream().filter(i->i.getId()%2==0)
                .filter(i->i.getAge()>23)
                .sorted(Comparator.comparing(User::getName).reversed())
                .limit(1)
                .forEach(i->System.out.println(i.getName().toUpperCase()));


        //uu: {{u1,u2,u3,u4,u5},{u6,u7}}
        uu.stream()
                .flatMap(u->u.stream())
                .collect(Collectors.toList())
                .forEach(i->System.out.println(i.getName()));

        //age>30  salary>500
        Map<Long, Optional<User>> map= uu.stream()
                .flatMap(i->i.stream())
                .filter(i->i.getAge()<30)
                .filter(i->i.getSalary()>500)
                .collect(Collectors.toMap(User::getId,i->Optional.of(i)));

        System.out.println(map);

    }


}
