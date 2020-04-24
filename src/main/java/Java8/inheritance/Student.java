package Java8.inheritance;

public class Student extends Person {
    private int score;

    public void setScore(int score){
        this.score=score;
    }

    public int setScore(){
        return this.score;
    }
    void sayHi(){
        System.out.println("Hi I am a Java8.Stream.Student");
    }

    public Student(){}
    public Student(String name, int age, int score){
        super(name, age);
        this.score=score;
    }

}
