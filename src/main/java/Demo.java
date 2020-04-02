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



