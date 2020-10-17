package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Binarysearch{
    public int firstPosition(int[] nums, int target){
        //null nor empty
        if(nums==null || nums.length==0){
            return -1;
        }

        int start=0, end=nums.length-1;

        //quit loop when they are neighbour;
        while(start+1<end){

            int mid=(end-start)/2+start;

            if(target==nums[mid]){
                end=mid;
            }
            else if(target<nums[mid]){
                end=mid;
            }
            else{
                start=mid;
            }
        }

        //double check
        if(nums[start]==target){
            return start;
        }

        if(nums[end]==target){
            return end;
        }

        return -1;
    }

    public int lastPosition(int[] nums, int target){

        if(nums==null || nums.length==0){
            return -1;
        }

        int start=0, end=nums.length-1;

        while(start+1<end){
            int mid=(end-start)/2 + start;

            if(target==nums[mid]){
                start=mid;
            }
            else if(target>nums[mid]){
                start=mid;
            }
            else{
                end=mid;
            }
        }

        if(nums[end]==target){
            return end;
        }

        if(nums[start]==target){
            return start;
        }

        return -1;


    }

    public static void main(String[] args){
        Binarysearch b=new Binarysearch();
       int a= b.firstPosition(new int[]{1, 2, 2, 4, 5},2 );
       int c= b.lastPosition(new int[]{1, 2, 2, 4, 5},2);
       System.out.println(a+","+c);

       Map<Integer,Integer> map = new HashMap<>();
        for(Map.Entry e:map.entrySet()){
    e.getValue();
        }
    }
}

