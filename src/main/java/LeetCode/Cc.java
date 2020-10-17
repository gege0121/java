package LeetCode;

import java.util.Arrays;
import java.util.List;

public class Cc {

    //reserve a string
    static String reserveString(String s){
        if(s==null){
            return null;
        }

        char[] c=s.toCharArray();
        for(int i=0, j=c.length-1;i<j;i++,j--){
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
        }

        return new String(c);
    }

    //
    static String reserveString1(String s){
        return new StringBuffer(s).reverse().toString();
    }

    static String removeVowles(String s){
        return s.trim().replaceAll("[AEIOUaeiou]", s).replaceAll("[ +]", " ");
    }

    static String removeVowels(String s){
        StringBuffer sb=new StringBuffer(s);

        Character vowels[]={'a', 'e', 'i', 'o', 'u', 'A','E','I','O','U'};

        List<Character> list=Arrays.asList(vowels);

        for(int i=0; i<sb.length(); i++){
            if(list.contains(sb.charAt(i))){
                sb.replace(i,i+1, " ");
                i--;
            }
        }

        return sb.toString();

    }


    public static void main(String[] args){
        System.out.println(Cc.reserveString("ab"));
        System.out.println(Cc.reserveString1("ab"));
    }
}
