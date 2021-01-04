package Interview;

import java.util.HashMap;
import java.util.Map;

public class AllUniqueChar {
    public boolean uqChar(String s){
        HashMap<Character, Integer> map=new HashMap<Character, Integer>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=0;i<n;i++){
            if(map.get(s.charAt(i))!=1) return false;
        }
        return true;
    }

    static boolean uniquer(String s){
        Map<Character, Integer> map=new HashMap<>();
        int length=s.length();
        for(int i=0; i<length;i++){
            Character c=s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        if(map.size()!=length){
            return false;
        }
        return true;
    }

    static boolean uniq3(String s){
        if(s==null || s.length()==0){
            return false;
        }

        Map<Character, Integer> map=new HashMap<>();

        char[] chars=s.toLowerCase().toCharArray();

        for(Character c:chars){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        if(map.size()!=s.length()){
            return false;
        }
        return true;

    }

    public static void main(String[] args){
        String input1="AbfsdF";
        //expected=false;
        String input2="abc";
        String input3="     ";
        String input4;

        System.out.println(AllUniqueChar.uniq3(input3));

//        boolean expected=false;
//       if (AllUniqueChar.uniquer(input1)==expected){
//           System.out.println("pass test");
//       }
//       else{System.out.println("not pass");}


    }
}
