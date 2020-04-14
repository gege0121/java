package Interview;

public class ArmStrong {

    public boolean isArmStrong(int number){
     int original=number;
     int result=0;
     while (number!=0){
         int reminder=number%10;
         result=result+reminder*reminder*reminder;
         number=number/10;
     }
     if(original==result) return true;
     else return false;
    }

    public static void main(String[] args){
        ArmStrong armStrong=new ArmStrong();
        boolean a=armStrong.isArmStrong(55);
        System.out.println(a);
    }

}
