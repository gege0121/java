package jaja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class W3resource141 {
//    static List<List<Integer>> mergeIntervals(List<List<Integer>> intervals ){
//        List<Integer> layer=new ArrayList<>();
//        List<List<Integer>> result=new ArrayList<>();
//
//        if(intervals==null || intervals.size()==0){
//            return null;
//        }
//
//       for(List<Integer> l:intervals){
//
//       }
//    }

    //141
    static boolean checkUniqeString(String s){
        if(s==null ||s.length()==0){
            return false;
        }
        HashMap<Character,  Integer> map=new HashMap<>();

        char[] chars=s.toLowerCase().toCharArray();
        for(Character c: chars){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Integer i: map.values()){
            if(i!=1){
                return false;
            }
        }
        return true;

    }

    //142
    //{"xyz","yzx"} -> true
    static boolean checkAnagrams(String s1, String s2){

        if(s1==null || s2==null || s1.length()!=s2.length()){
            return false;
        }
        if(s1.length()==0 && s2.length()==0){
            return true;
        }

        char[] chars=s1.toLowerCase().toCharArray();
        char[] chars1=s2.toLowerCase().toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars1);

        for(int i=0; i<s1.length();i++){
            if(chars[i]!=chars1[i]){
                return false;
            }
        }

        return true;

    }

    //144
    //remove all occurrences of a specified value in a given array of integers and return the new length of the array.
    //{1,2,4,4,6}->4
    static int removeElement(int[] nums, int k){
        if(nums==null || nums.length==0){
            return 0;
        }

      List<Integer> result=new ArrayList<>();
        for(int i: nums){
            if(i!=k){
                result.add(i);
            }
        }
        return result.size();
    }


    //145,remove nth element from the end of the array.
    static int[] removeNthFromArray(int[] nums, int target){
        if(nums==null || nums.length==0 || target>nums.length){
            return null;
        }

        int length=nums.length;
        int i=0;
        int[] arr=new int[length-1];

        for( int j=0;j<length-1;j++){
            if(i!=length-target){
                arr[j]=nums[i];
                i++;
            }
            else{
                j++;
            }
        }

        return arr;

    }

    static int[] remove(int[] nums, int k){
        if(nums==null || nums.length==0 || k>nums.length){
            return null;
        }

        int length=nums.length;
        int[] result=new int[length-1];

        for(int j=0,i=0; j<nums.length; j++){
            if(j!=k){
                result[i]=nums[j];
                i++;
            }
            else{
                j++;
            }
        }
        return result;

    }


    static int[] removeNthFromArray2(int[] nums, int target) {
        if(nums==null||nums.length==0||target<0||target>nums.length) return null;
        int[] res = new int[nums.length - 1];
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (i == nums.length - target) {
                if(i== nums.length-1) return res;
                j++;
            }
            res[i] = nums[j];
            i++;
        }
        return res;
    }




    public static void main(String[] args){
        int[] test={1,2,3,4,5,5};
       // System.out.println(W3resource141.checkUniqeString("Xx"));
        //System.out.println(W3resource141.checkAnagrams("XYZ","yxa"));
        //System.out.println(W3resource141.removeElement(test,5));
        System.out.println(Arrays.toString(W3resource141.removeNthFromArray2(test,2)));
       // System.out.println(W3resource141.uniqueFirstCharacter("wresome"));
    }
}
