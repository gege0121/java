package DataStructure;

import java.util.LinkedList;
import java.util.List;

public class Interval {
    int start;
    int end;

    Interval(){
        start=0;
        end=0;
    }

    Interval(int s, int e){
        start=s;
        end=e;
    }

    //
    static List<Interval> subarraySum(int[] nums) {

        List<Interval> temp=new LinkedList<>();

        if (nums == null || nums.length == 0) {
            return null;
        }

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum == 0) {
                    temp.add(new Interval(i,j));
                }
            }
        }
        return temp;


    }

    public static void main(String[] args){
        int[] test={3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        System.out.println(Interval.subarraySum(test));
    }

}
