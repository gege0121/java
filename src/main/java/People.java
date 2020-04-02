public class People implements Comparable<People> {
    private String name;
    private Integer salary;
    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age<0 || age>100){
            throw new IllegalArgumentException("invaild age value");
        }
        this.age = age;
    }



    public int compareTo(People people) {
        return this.age - people.age;

    }

    public boolean isQualified() {
        return  age==25;
    }


    public People(String name, Integer salary, Integer age){
        this.name=name;
        this.salary=salary;
        this.age=age;
    }

//    public int compareTo(Object o) {
//        People input =(People)o;
    //// casting
//        return this.age-input.age;
//    }

    public String toString(){
        return getName() + " " + getAge() + " " + getSalary();
    }
}
