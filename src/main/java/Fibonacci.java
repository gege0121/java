public class Fibonacci {
    //Given a number n, print n-th Fibonacci Number.
    public int fibonacciRecursive(int x){
        if (x==0) return 0;
        if (x==1) return 1;
        return fibonacciRecursive(x-1)+fibonacciRecursive(x-2);

    }

    public int fibonacciIterate(int x){
    int a=0, b=1,c=1;
    for(int i=1;i<x;i++){
        c=a+b;
        a=b;
        b=c;
    }
    return c;
    }

    public int fibonacciFormula(int x){
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(phi, x) / Math.sqrt(5));


    }

    public static void main(String[] args){
        Fibonacci ff=new Fibonacci();
        int f1= ff.fibonacciRecursive(5);
        int f2= ff.fibonacciIterate(5);
        int f3= ff.fibonacciFormula(5);
        System.out.println(f1+" "+f2+" "+f3);
    }
}
