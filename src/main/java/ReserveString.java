public class ReserveString {

    public String reverseString(String s) {
        char[] c = s.toCharArray();
        for (int i=0,j=c.length-1;i<j;i++,j--){
            char temp = c[i];
            c[i]=c[j];
            c[j]=temp;
        }
        return new String(c);
    }


//    public String reverseString(String s) {
//        return new StringBuilder(s).reverse().toString();
//    }
}
