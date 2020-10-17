package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Alog {

    static boolean sumExist(int[] arr, int target){
        if(arr == null) return false;

        Set<Integer> set = new HashSet();
        for(int i : arr){
            if(set.contains(target - i)){
                return true;
            }else{
                set.add(i);
            }
        }
        return false;
    }

    static String reverseString(String s){
        if(s == null) return null;
        char[] arr = s.toCharArray();
        int j = s.length() - 1;
        for(int i=0;i<s.length()/2;i++){
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            j--;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        System.out.println(sumExist(null, 5));// test case: array is null


        System.out.println(sumExist(new int[]{1,2,3,4,}, (Integer)null));

        int[] t = {1};
        System.out.println(sumExist(t, 1)); // test case: array has less than 2 element

        t = new int[]{1, 3, 10, 4};
        System.out.println(sumExist(t, 15)); // test case: no valid pair
        System.out.println(sumExist(t, 5)); // test case: has valid case


        System.out.println("---------------------------------------------------------------------------");
        System.out.println(reverseString(null));
        System.out.println(reverseString("abc"));
        System.out.println(reverseString("ab"));
        System.out.println(reverseString("a"));
    }

}
