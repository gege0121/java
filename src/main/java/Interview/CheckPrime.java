package Interview;

public class CheckPrime {

    public boolean check1(int number){
        if (number%2==0) return false;
        for (int i=3;i<=Math.sqrt(number);i+=2){
            if(number%i==0) return  false;
        }
        return true;
    }

    public static void main(String[] args){
        CheckPrime cc=new CheckPrime();
        boolean a=cc.check1(51);
        System.out.println(a);
    }

}
