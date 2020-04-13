public class Factorial {
//revursive
    public int fac(int n){
        if (n==0) return 1;
        if (n==1) return 1;
        return fac(n-1)*n;
    }
//loop
    public int fac1(int x){
        if (x==0) return 1;
        int result=1;
        for(int i=1;i<=x;i++){
            result=result*i;
        }
        return result;
    }

    public static void main(String[] args){
        Factorial factorial=new Factorial();
        int c=factorial.fac(5);
        int b=factorial.fac1(5);
        System.out.println(b+" "+c);
    }
}
