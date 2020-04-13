import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class IterateString {
    //using simple for loop
    public String iterate1(String str){
        char[] char1=new char[str.length()];
        int j=str.length()-1;
        for(int i=0;i<str.length();i++){
            char1[j]=str.charAt(i);
            j--;
        }
        return String.valueOf(char1);
    }

    //using toCharArray
    public String iterate2(String str){
        char[] char1=str.toCharArray();
        char[] char2=new char[str.length()];
        int i=str.length()-1;
        for(Character c: char1){
            char2[i]=c;
            i--;
        }
        return new String(char2);
    }

    // Iterate over characters of a String
    public String iterate3(String str){
        CharacterIterator it = new StringCharacterIterator(str);
        char[] char1=new char[str.length()];
        int j=str.length()-1;
        while (it.current() != CharacterIterator.DONE) {
               char1[j]=it.current();
                it.next();
                j--;
            }
        return new String(char1);
        }


    public static void main(String[] args){
        IterateString iterateString=new IterateString();
        String s1=iterateString.iterate1("sfdsa");
        String s2=iterateString.iterate2("sfdsa");
        String s3=iterateString.iterate3("sfdsa");
        System.out.println(s1);
        System.out.println(s1);
        System.out.println(s3);
    }

}
