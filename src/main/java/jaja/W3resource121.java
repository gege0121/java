package jaja;

import com.sun.tools.javac.util.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class W3resource121{
    //122
    //find a contiguous subarray with largest sum from a given array of integers.
    //sum<0, sum=0;之前的sum没有意义，舍弃掉
    // {1,2,3,-1,5}->10
    //todo:理解
    static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int length = nums.length;
        int sum = 0;
        int max = nums[0];

        for (int i = 0; i < length; i++) {

            sum += nums[i];
            if(sum>max){
                max=sum;

            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }


    //22.2
    //todo:理解
    static int maxSubarray3(int[] nums){
        if(nums==null || nums.length==0){
            return 0;
        }

        int global= nums[0];
        int local=nums[0];

        for(int i=0;i<nums.length;i++){
            local=Math.max(nums[i], local+nums[i]);
            global=Math.max(local,global);
        }

        return global;
    }

    //23
    static int minSubarray(int[] nums){
        if(nums==null || nums.length==0){
            return -1;
        }

        int min=nums[0];
        int sum=nums[0];

        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i], min+nums[i]);
            sum=Math.min(min, sum);

        }
        return sum;
    }


    //124
    //Write a Java program to find the index of a value in a sorted array.
    //binary search
     static int findIndex(int[] nums, int targrt){
        if(nums==null || nums.length==0){
            return -1;
        }

        int start=0;
        int end=nums.length-1;

        while(start+1<end){
            int mid=start+(end-start)/2;

            if(targrt==nums[mid]){
                end=mid;
            }
            else if(targrt<nums[mid]){
                end=mid;
            }
            else{
                start=mid;
            }
        }

        if(nums[start]==targrt){
            return start;
        }

        if(nums[end]==targrt){
            return end;
        }

        return -1;
    }

    //25
    //preorder


    //28
    // Write a Java program to calculate the median of an given unsorted array of integers.
    static double medUnsorted(int[] nums){
        if(nums==null || nums.length==0){
            return -1;
        }

        int length=nums.length;
        int mid=0;
        if(length%2==0){
            return ((nums[length/2]+nums[length/2-1])/2);
        }
        else{
            return nums[(length-1)/2];
        }
    }

    //29
    //hashmap
    static int getSingleNumber(int[] nums){
        if(nums==null || nums.length==0){
            return -1;
        }

        HashMap<Integer, Integer> map=new HashMap<>();

       for(int i=0;i<nums.length;i++){
           map.put(nums[i], map.getOrDefault(nums[i],0)+1);
       }

       for(int j: map.keySet())
       if(map.get(j)==1){
           return j;
       }


       return -1;
    }

    //29.2
    //


    public static void main(String[] args){
        int[] nums={10,10,30,30,5};
        int[] nums1={2,3,4,4,3};

        Map<Integer,int[]> map1=new HashMap<>();
        int expected=5;
        map1.put(expected,nums);
        map1.put(6,nums1);

        for(Map.Entry<Integer, int[]> entry: map1.entrySet()){
           for(Integer j:map1.keySet()){
               if(j!=W3resource121.getSingleNumber(map1.get(j))){
                 break;

               }
               else{
                   System.out.println("pass tests!");
               }
           }

        }


       // System.out.println(W3resource121.maxSubArray(nums));
       // System.out.println(W3resource121.minSubarray(nums));
        //System.out.println(W3resource121.findIndex(nums,6));
       // System.out.println(W3resource121.medUnsorted(nums));
       // System.out.println(W3resource121.getSingleNumber(nums));
    }
}
