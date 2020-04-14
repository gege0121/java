package Java8.Stream;

import Java8.Stream.Person;
import Java8.Stream.Student;

public class Demo {
    static void somebodySayHi(Person a){
        a.sayHi();
    }

    public static void main(String[] args) {
        Person a = new Student();
        Person b = new Person();
        somebodySayHi(a);
        somebodySayHi(b);
    }
}



