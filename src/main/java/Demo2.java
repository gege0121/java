import java.lang.reflect.Array;
import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String> ();
        al.add("Sachin");
        al.add("Rahul");
        System.out.println(al);

        HashMap<String, Integer> map=new HashMap<>();
        map.put("c",1);
        map.put("a",2);
        map.put("b",3);
       for(String k : map.keySet()){
           System.out.println(k+":"+map.get(k));
       }

        String s = "dskfns";
        char[] chars = s.toCharArray();
        System.out.println(chars);

        List<char[]> list= Arrays.asList(chars);
        System.out.println(list.toString());

        List<Character> listC = new ArrayList<Character>(chars.length);
        for (Character c : chars) {
            listC.add(c);

        }

        Character[] cd=new Character[listC.size()];
        int j=0;
        for(Character ii:listC){
            cd[j]=ii;
            System.out.println(cd[j]);
            j++;
        }

//        for (char c : chars) {
//            listC.add(c);
//        }
//        listC.addAll(chars,array);
//
//    }

    }
}