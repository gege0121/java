package LeetCode;

import java.util.HashMap;

public class TwoSum___1 {

    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public int[] twoSum(int[] numbers, int targer) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(targer - numbers[i])) {
                result[0] = i;
                result[1] = map.get(targer - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return  result;
    }

    public static void main(String[] args){
    TwoSum___1 T1=new TwoSum___1();
    int[] ai=new int[]{2,7,9,11};
    int[] t2= T1.twoSum(ai,11);
    System.out.println(t2[0]+" "+t2[1]);
    }
}
