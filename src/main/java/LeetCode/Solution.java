package LeetCode;

import java.util.HashMap;
import java.util.List;

public class Solution {
    static String reserveString(String s){
        if(s==null){
            return null;
        }

        char[] c=s.toCharArray();

        for(int i=0,j=c.length-1; i<j;i++,j--){
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
        }

        return new String(c);

    }
    //list of string, target string
    //int numbers of the target
    //hashmap<string, count>
    //add the List<String> to map
    //condition:
    // map.get(target);

//    static Integer countNumber(List<String> s, String target){
//      //  if(s==null){}
//
//        HashMap<String, Integer> map=new HashMap<>();
//
//        for(int i=0;i<s.size();i++) {
//            for (String c : s) {
//                    map.put(c,map.getOrDefault(c,0)+1);
//                }
//            }
//        return  map.get(target);
//
//    }
//
//
//    public static void main(String[] args){
//        System.out.println(Solution.reserveString("abc"));
//        System.out.println(Solution.countNumber({"abc","this","this"}, "this");
//
//
//    }

}
