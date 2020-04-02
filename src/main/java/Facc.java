public class Facc {
    //Given a number n, print n-th Fibonacci Number.
    public int facc(int x){
        if (x==0) return 0;
        if (x==1) return 1;
        return facc(x-1)+facc(x-2);

    }
}
