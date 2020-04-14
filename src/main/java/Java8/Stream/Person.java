package Java8.Stream;

public class Person {
    private int age;
    private  String name;
    private String fname;
    private String lname;

    void sayHi(){
        System.out.println("Hi");
    }
    //constructor default
    //new Java8.Stream.Person();
    public Person(){
    }

    //constructor
    // >>>>>new Java8.Stream.Person("gg",22);
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        //checked exception=compile time exception
        //checked exception must be catched
        if(age<0 || age>100){
            // throw check exception & uncheck exception
            throw new IllegalArgumentException("invalid age");
            // throw an exception
            // throws exceptions
        }
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setName(String fname, String lname){
        this.fname=fname;
        this.lname=lname;
    }

    public String getFName(){
        return fname + " "+ lname;
    }

    private int birth(int currentYear){
        return currentYear-this.age;
    }

    public int getBirth(){
        return birth(2020);
    }

}
