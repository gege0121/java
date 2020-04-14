package Interview;

import java.util.ArrayList;
import java.util.List;

public class Repalce {
    //1 change vowels to ch
    public String replace(String str, char ch){
       String s2=str.replaceAll("[AEIOUaeiou]",Character.toString(ch));
       return s2;
    }

    //2 if "d" in the string, change to ch
    public String replace2(String str, char ch){
        StringBuffer stringBuffer=new StringBuffer(str);
        List<Character> thechar=new ArrayList();
        thechar.add(ch);
        for(int i=0; i<stringBuffer.length();i++){
            if (thechar.contains(stringBuffer.charAt(i))){
                stringBuffer.replace(i,i+1,"123");
                i++;
            }
        }
        return stringBuffer.toString();
    }
    //driven class
    public static void main(String[] args){
        Repalce repalce=new Repalce();
        System.out.println(repalce.replace("fsdfsfa",'1'));
        System.out.println(repalce.replace2("dfnsdf",'d'));

    }
}
