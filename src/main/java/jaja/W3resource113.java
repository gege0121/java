package jaja;

import java.util.Arrays;
import java.util.stream.IntStream;

public class W3resource113 {

    //13merge two given sorted array of integers and create a new sorted array.
    //{1,3,5} {2,4,6}->{1,2,3,4,5,6}
    static int[] mergeArraySorted(int[] nums1, int[] nums2){
        int l1=nums1.length;
        int l2=nums2.length;
        int[] result=new int[l1+l2];
        int i=0,j=0,k=0;
        while(i<l1 && j<l2){
            if (nums1[i]<nums2[j]){
                result[k++]=nums1[i++];
            }
            else{
                result[k++]=nums2[j++];
            }
        }

        while(i< l1){
            result[k++]=nums1[i++];
        }
        while(j<l2){
            result[k++]=nums2[j++];
        }

        return result;
    }

    //114
    //given a string and an offset, rotate string by offset (rotate from left to right).
    //a,b,c,d,e offset=3    -> c,d,e,a,b
    static String roateString(String s, int offset){
        String ab=s.substring(offset)+s.substring(0,offset);
        return ab;
    }

    //114.2
    //substring
    static String roatateString1(String s, int offset){
        return (s+s).substring(offset,offset+s.length());
    }

    //14.3
    //将前半段存进array中，后半段写进去，再把前半段拼接进去
    //char[] 记得初始长度， new char[长度]
     static String roateString3(String s, int offset){
        char[] chars=s.toCharArray();
        char[] temp=new char[offset];
        for(int i=0;i<offset;i++){
            temp[i]=chars[i];
        }
        for(int i=0;i<s.length()-offset;i++){
            chars[i]=chars[i+offset];
        }
        int j=0;
        for(int i=offset;i<s.length();i++){
            chars[i]=temp[j++];
        }
        //return new String(chars);
            return String.valueOf(chars);
     }

     //15 check positive integer palindrome
    //integer
    static boolean isPalindrome1(int num){
        if(num==0){
            return false;
        }
        int temp=num;
        int reserve=0;

        while(num>0) {
            int reminder = num % 10;
            reserve=reserve*10+reminder;
            num = num / 10;
        }

        if(temp==reserve){
            return true;
        }
        else return false;

    }

    //15.2
    //integer转为string转为character，比较前后是否一样
    static boolean isPalindrome2(int num){
        if(num<10){
            return true;
        }
        String s=String.valueOf(num);
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)==s.charAt(j)){
                return true;
            }
        }
        return false;

    }

    //16 fizzbuzz
    static String fizzbuzz(int num){
        if(num==0){
            return "it's 0";
        }
        if(num%3==0 && num%5==0){
            return "fizzbuzz";
        }
        else if(num%3==0){
            return "fizz";
        }
        else if (num%5==0){
            return "buzz";
        }
        else return "not a fizzbuzz nor fizz nor buzz";
    }

    //16.2 using stream
   static void fizzbuzz2(int num){
           IntStream.rangeClosed(0,num).mapToObj(
                   i->i % 3==0 ?
                           ( i % 5 == 0 ? "Fizzbuzz" : "Fizz"):
                           ( i % 5 == 0 ? "Buzz" : i))
                   .forEach(System.out::print);
    }

    //16.3

    //17
    //compute the square root of an given integer.
    //9->3
    static int square(int num){

        if(num<=1){
            return num;
        }

        for(int i=1;i<=num;++i){
            if(i*i>num){
                return (int)i-1;
            }
        }

        return -1;
    }

    //binary search
    static int square2(int num){
        int l=1, r=num;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid*mid>num){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return r;
    }

    //binary search 2
    static int mySqrt(int x) {

        if(x==0){return 0;}
        long start=0, end=x;

        while(start+1<end){
            long mid=(end-start)/2+start;
            if(mid*mid<=x){
                start=mid;
            }else{end=mid;}
        }

        if(end*end==x){
            return (int) end;
        }

        return (int) start;
    }


    //18
    //get the first occurrence (Position starts from 0.) of a string within a given string
    //indexOf()

    static int find(String s, String target){
        int i=s.indexOf(target);
        return i;
    }
    static int firstOccurrence(String s1, String target){

        int i=s1.indexOf(target);
        return i;
    }


    //18.2
    //for loop
    //todo: 理解
    static int subStringIndex(String str, String substr) {

        int substrlen = substr.length();
        int strlen = str.length();
        int j = 0;

        if(substrlen >= 1){
            for(int i=0; i<strlen; i++){
                if(str.charAt(i)==substr.charAt(j)){
                    j++;
                    //出口
                    if(j==substrlen){
                        return i-substrlen+1;
                    }
                }
                else{
                    j=0;
                }
            }
        }

        return -1;
    }

    //119
    //get the first occurrence (Position starts from 0.) of an element of a given array.
    //{2,4,6,7,9},7->3
    static int findInt(int[] nums, int target){
        if(nums==null || nums.length==0){
            return -1;
        }

        for(int i=0; i< nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;

    }

    //120
    //searches a value in an m x n matrix
    static boolean searchMatrix(int[][] matrix, int target){
        if(matrix==null || matrix.length==0){
            return false;
        }
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    //binary search
    static boolean searchMatrix2(int[][] matrix, int target){
        if(matrix==null || matrix[0]==null || matrix.length==0 || matrix[0].length==0){
            return false;
        }

        int row=matrix.length;
        int column=matrix[0].length;

        //define row;
        int start=0, end=row-1;

        while (start+1<end){
            int mid=start+(end-start)/2;
            if(matrix[mid][0]==target){
                return true;
            }
            else if(matrix[mid][0]==target){
                start=mid;
            }
            else{
                end=mid;
            }
        }

        if (matrix[end][0] <= target) {
            row = end;
        } else if (matrix[start][0] <= target) {
            row = start;
        } else {
            return false;
        }

        //define column
        start = 0;
        end = column - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (matrix[row][start] == target) {
            return true;
        } else if (matrix[row][end] == target) {
            return true;
        }
        return false;
    }



    public static void main(String[] args){
        int[] test1={1,3,5};
        int[] test2={2,4,5,6};
        int[][] matrix={{1,2,3}, {4,5,6}};
       System.out.println(Arrays.toString(W3resource113.mergeArraySorted(test1,test2)));
      //  System.out.println(W3resource113.roateString3("abcdef",3));

       // System.out.println(W3resource113.isPalindrome2(919));
       // System.out.println(W3resource113.fizzbuzz(0));
      // W3resource113.fizzbuzz2(55);
       // System.out.println(W3resource113.square2(2));
      //  System.out.println(W3resource113.firstOccurrence("abcd","b"));
       //ystem.out.println(W3resource113.subStringIndex("abcd","b"));
       // System.out.println(W3resource113.findInt( test1, 0));
        //System.out.println(W3resource113.searchMatrix(matrix,9));
    }
}
