package jaja;

import java.util.*;

public class W3resource131 {
    //131
    //find the new length of a given sorted array where each element appear only once (remove the duplicates )
    //{1,1,2,2,2,3,4}->{1,2,3,4}

    static int removeDuplicates(int[] nums){
        if(nums==null || nums.length==0){
            return 0;
        }

        List<Integer> list=new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=nums[i+1]){
                list.add(nums[i]);
            }
        }

        return list.size();

    }

    static int size(int[] nums){
        if(nums==null ){
            return -1;
        }

        HashMap<Integer, Integer> hashMap=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i],0)+1);
        }

        return hashMap.size();
    }

    //132
    //find the new length of a given sorted array where duplicate elements appeared at most twice.
    //{1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7} ->10

    static int countDduplicates(int[] nums){
        if(nums==null){
            return 0;
        }
        if(nums.length<=1){
            return 0;
        }

        HashMap<Integer, Integer> hashMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i],0)+1);
        }

        int count=0;

        for(Integer key:hashMap.keySet()){
            if(hashMap.get(key)==2){
                count++;
            }
        }
        return count;

    }

    //33
    // find a path from top left to bottom in right direction which minimizes the sum of all numbers along its path
    //{{7,4,2},
    // {0,5,6},
    // {3,1,2}};  ->13
    //todo:  理解 dp O(mn)
    static int minPathSum(int[][] grid){
        if(grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }

        int m=grid.length;
        int n=grid[0].length;
        int[][] sum=new int[m][n];

        sum[0][0]=grid[0][0];

        for(int i=1;i<m;i++){
            sum[i][0]=sum[i-1][0]+grid[i][0];
        }

        for(int j=1;j<n;j++){
            sum[0][j]=sum[0][j-1]+grid[0][j];
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                sum[i][j]=Math.min(sum[i-1][j],sum[i][j-1])+grid[i][j];
            }
        }

        return sum[m-1][n-1];

    }

    //34
    //climb stairs
    static int climbStairs(int num){
        if(num<=1){
            return 1;
        }

        return climbStairs(num-1)+climbStairs(num-2);

    }

    //36
    // find possible unique paths from top-left corner to bottom-right corner of a given grid (m x n).
    //recursive
    //The time complexity of above recursive solution is exponential

    static int uniquePath(int m, int n){
        if(m==0 || n==0){
            return 0;
        }
        if(m==1 || n==1){
            return 1;
        }
        return uniquePath(m-1,n) +uniquePath(m,n-1);
    }

    //36.2
    //dynamic programming
    //Time complexity of the above dynamic programming solution is O(mn).
    //The space complexity of the above solution is O(mn).
    static int uniquePath2(int m, int n){
        int count[][] = new int[m][n];

        for (int i = 0; i < m; i++)
            count[i][0] = 1;

        for (int j = 0; j < n; j++)
            count[0][j] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++)
                count[i][j] = count[i - 1][j] + count[i][j - 1]; //+ count[i-1][j-1];
        }
        return count[m - 1][n - 1];
    }

    //37
    //dynamic programing
    static int uniquePathsWithObstacles(int[][] grid){
        if(grid==null || grid.length==0){
            return 0;
        }

        int m=grid.length;
        int n=grid[0].length;

        if(grid[0][0]==1 || grid[m-1][n-1]==0){
            return 0;
        }

        int[][] dp=new int[m][n];
        dp[0][0]=1;

        //left column
        for(int i=1; i<m; i++){
            if(grid[i][0]==1){
                dp[i][0] = 0;
            }else{
                dp[i][0] = dp[i-1][0];
            }
        }

        //top row
        for(int i=1; i<n; i++){
            if(grid[0][i]==1){
                dp[0][i] = 0;
            }else{
                dp[0][i] = dp[0][i-1];
            }
        }

        //fill up cells inside
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(grid[i][j]==1){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }

            }
        }

        return dp[m-1][n-1];
    }


    //38
    //find all of the longest word in a given dictionary.
    //{
    //"cat",
    //"flag",
    //"green",
    //"country",
    //"w3resource"
    //}
    //Result: "w3resource"


    static List<String> findLongestString(String[] dictionary){
        if(dictionary==null || dictionary.length==0){
            return null;
        }
        List<String> longestString=new ArrayList<>();
        int length=0;

        for(String s: dictionary){
            if(s.length()>length){
                length=s.length();
            }
        }

        for(String s:dictionary){
            if(s.length()==length){
                longestString.add(s);
            }
        }

        return longestString;

    }



    static ArrayList<String> longestWords(String[] dictionary){
        ArrayList<String> result=new ArrayList<>();
        int length=0;
        for(String string: dictionary){
            if(string.length()>length){
                length=string.length();
            }
        }

        for(String string : dictionary){
           if(string.length()==length){
               result.add(string);
           }
        }

        return result;
    }


//    static List<String> longestInSentence(String s){
//        if(s==null || s.length()==0){
//            return null;
//        }
//
//        String[] string=s.replaceAll("[^a-zA-Z0-9]"," ").split(" ");
//
//    }

    //38.2 longest words in a string
    static ArrayList<String> longtestWordsInSentence(String sentence){

        ArrayList<String> result=new ArrayList<>();

        //important
        String[] strings=sentence.replaceAll("[^a-zA-Z0-9]"," ").split(" ");

        int length=0;

        for(String s: strings){
            if(s.length()>length){
                length=s.length();
            }
        }

        for(String s: strings){
            if(s.length()==length){
                result.add(s);
            }
        }

        return result;
    }

    //39
    //todo:理解
    //get the index of the first number and the last number of a subarray where the sum of numbers is zero from a given array of integers.
    static int[] findSubWithKSum(int[] nums, int k) {
        if (nums.length <= 0) return null;
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                res[0] = map.get(sum - k) + 1;
                res[1] = i;
                break;
            } else if (sum == k) {
                res[0] = 0;
                res[1] = i;
                break;
            }
            map.put(sum, i);
        }
        return res;
    }

    //40



    public static void main(String[] args){
        int[] nums={1,1,2,2,3,3,4,5,6,7,7};
        int[] test1={1,2,-2,3};

        int[][] test=new int[][]{
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        String [] dict = {"cat", "dog", "red", "is", "am","abcd"};
        String s="I am a good hahahahah,,,,,colleague.";
        //System.out.println(W3resource131.size(nums));
        //System.out.println(W3resource131.countDduplicates(nums));
       // System.out.println(W3resource131.minPathSum(test));
       // System.out.println(W3resource131.climbStairs(4));
        //System.out.println(W3resource131.uniquePath2(3,2));
        //System.out.println(W3resource131.uniquePathsWithObstacles(test));
       // System.out.println(W3resource131.longestWords(dict));
        //System.out.println(W3resource131.longtestWordsInSentence(s));
        System.out.println(Arrays.toString(W3resource131.findSubWithKSum(test1,4)));

    }
}
