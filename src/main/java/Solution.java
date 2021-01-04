import java.util.HashSet;

public class Solution {
    public static boolean isSumExist(int[] nums, int target){
        if (nums==null){
            return false;
        }
        HashSet<Integer> set=new HashSet<>();
        for (int i : nums){
            if(set.contains(target-i)){
                return true;
            }
            else set.add(i);

        }
        return false;
    }

    public static String reserveString(String string){
        if(string==null){return null;}
        char[] chars=string.toCharArray();
        int n=string.length();
        for(int i=0, j=chars.length-1;i<j; i++, j--){
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
        }

        return new String(chars);
    }

    public static void main(String[] args){
//        System.out.println(Solution.isSumExist(null, 3));
//        System.out.println(Solution.isSumExist(new int[]{1,2,3,4}, 6));
//        System.out.println(Solution.isSumExist(new int[]{1,2,3,4},9));
//        System.out.println(Solution.isSumExist(new int[]{1}, 1));
//

        System.out.println(Solution.reserveString(null));
    }
}
