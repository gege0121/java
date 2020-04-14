package Interview;

public class FizzBuzz {
    //fizz----3
    //Buzz----5
    //fizzbuzz-----15

    public String fiz(Integer integer){
        if (integer%3==0){
            if (integer%5==0) return "Interview.FizzBuzz";
            else return "Fizz";
        }
        else if (integer%5==0) return "Buzz";
        else return String.valueOf(integer);
    }

    public static void main(String[] args){
        FizzBuzz fizzBuzz=new FizzBuzz();
        System.out.println(fizzBuzz.fiz(44));
    }
}
