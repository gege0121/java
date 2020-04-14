package Interview;

public class ReserveString {

    //for loop change front to end
    public String reverseString(String s) {
        char[] c = s.toCharArray();
        for (int i=0,j=c.length-1;i<j;i++,j--){
            char temp = c[i];
            c[i]=c[j];
            c[j]=temp;
        }
        return new String(c);
    }

    //stringbuilder
    public String reverseString1(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // recursive
    public static String reverseString2(String str) {
        if (str.isEmpty())
            return str;

        return reverseString2(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args){
        ReserveString reserveString=new ReserveString();
        String s1=reserveString.reverseString("jessica is back");
        String s2=reserveString.reverseString1("Jessica is back");
        String s3=reserveString.reverseString2("Jessica is back");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
