public class Palindrome {
    public boolean pal(Integer num){
        int Oringinal=num;
        int remainder;
        int reversedInteger=0;
        while (num != 0) {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num /= 10;
        }
        if(Oringinal==reversedInteger) return true;
        else return false;
    }
}
