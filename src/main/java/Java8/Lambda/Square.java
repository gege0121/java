package Java8.Lambda;


// Implementation of functional interface using lambda expressions
@FunctionalInterface
public interface Square {
    int calculate(int x);
}

class Test {
    public static void main(String args[]){
        int a = 5;

        // lambda expression to define the calculate method
        Square s = (int x)->x*x;

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}

//常见的lambda表达式：
