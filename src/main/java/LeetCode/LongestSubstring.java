package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {

    public boolean isUnique(String s, int start, int end){
        Set<Character> set=new HashSet<>();
        for(int i=start;i<end;i++){
            if(set.contains(s.charAt(i))){
                return false;
            }
            set.add(s.charAt(i));
        }
        return true;
    }

    public int longestSubstring1(String s){
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(isUnique(s,i,j)==true){
                    res=Math.max(res,j-i);
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        LongestSubstring l=new LongestSubstring();
        int a=l.longestSubstring1("aabbabc");
        System.out.println(a);
    }


}
