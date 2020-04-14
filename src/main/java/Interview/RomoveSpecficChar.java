package Interview;

import java.util.Arrays;
import java.util.List;

public class RomoveSpecficChar {
    public String remove(String s){
        String s1=s.trim();
        String string=s1.replaceAll("[AaEeIiOoUu]","");
        String s2=s1.replaceAll(" +", " ");
       // char[] chars=s.toCharArray();
        return s2;


    }

    public String removebuffer(String s){
       //Character vow[]={'A','E','I','O','U','a','e','i','o','u'};
       Character[] vow={'A','E','I','O','U','a','e','i','o','u'};
        List<Character> a= Arrays.asList(vow);
        StringBuffer sb=new StringBuffer(s);
        for(int i=0;i<sb.length();i++){
            if (a.contains(sb.charAt(i))){
                sb.replace(i,i+1,"");
                i--;
            }
        }
        return sb.toString();

    }
}
