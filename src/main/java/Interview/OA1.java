package Interview;

public class OA1 {
    public static int solution(int N) {
        // write your code in Java SE 8
        int digit = 0;
        int temp = N;
        while(temp!=0){
            temp = temp/10;
            digit++;
        }
        return  (int)Math.pow(10,digit-1);
//        return digit;
    }

    public static void main(String[] args) {
        System.out.println(solution(999));
    }
}