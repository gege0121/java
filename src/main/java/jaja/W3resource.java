package jaja;

import java.util.Arrays;

public class W3resource {

    //100
    //count the two elements of two given arrays of integers with same length, differ by 1 or less.
    //{10,20,11},{11,21,12}
    //3
    static int arrayDiffer(int[] a, int[] b){
        if(a==null || b==null ||a.length==0 || b.length==0){
            return -1;
        }
        int result=0;
        for(int i=0;i<a.length;i++){
            if(Math.abs((a[i]-b[i]))<=1){
                result++;
            }
//            if(a[i]==b[i] || a[i]==b[i]+1 || b[i]==a[i]+1){
//            }
        }
        return result;
    }

    static int arrayDiffer2(int[] num1,int[] num2){
        if(num1==null || num2==null || num1.length==0 || num2.length==0){
            return 0;
        }
        int result=0;
        for(int i=0;i<num1.length;i++){
            if(num1[i]==num2[i] || num1[i]+1==num2[i] || num1[i]==num2[i]+1){
                result++;
            }
        }
        return result;
    }



    //101
    //check if the number of 10 is greater than number to 20's in a given array of integers
    //{10,10,20,10}->true
    //{10,20}->false
    static boolean valueGreater20(int[] nums){
        if(nums==null ||nums.length==0){
            return false;
        }
        int a=0, b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==10){
                a++;
            }
            if(nums[i]==20){
                b++;
            }
        }
        if(a>b){
            return true;
        }
        return false;
    }

    //102
    //check if a specified array of integers contains 10's or 30's.
    static boolean check10or30(int[] nums){
        if(nums==null || nums.length==0){
            return false;
        }
        for(int i:nums){
            if(i==10 || i==30){
                return false;
            }
        }
        return true;
    }

    //103
    //create a new array from a given array of integers, new array will contain the elements from the given array after the last element value 10.
    //{11,10,13,10,45,20,33,53}->{45,20,33,53}
    static int[] arrayAfter10(int[] nums){

        if(nums==null || nums.length==0){
            return null;
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==10){
                nums=Arrays.copyOfRange(nums,i+1,nums.length);
                break;
            }
        }
        return nums;

    }

    static int[] arrayAfter10_2(int[] nums){
        if(nums==null || nums.length==0){
            return null;
        }
        int length=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==10){
               length=nums.length-i-1;
            }
        }
        int[] result=new int[length];
        for(int i=0,j=nums.length-length;i<length;i++,j++){
            result[i]=nums[j];
        }
        return result;
    }

    //105
    //check if a group of numbers (l) at the start and end of a given array are same
    //{1,2,5,6,7,2,1} l=2->true

    static boolean startEqualsEnd(int[] nums, int l){
        if(nums==null || nums.length==0){
            return false;
        }
        if(2*l>nums.length){
            return false;
        }

        for(int i=0;i<l;i++){
            if(nums[i]==nums[nums.length-1-i]){
                return true;
            }
            return false;
        }
        return false;

    }

    //106
    //create a new array that is left shifted from a given array of integers
    //{1,3,5,7}->{3,5,7,1}
    //null leads to null pointer exception

    static int[] leftShifted(int[] nums){
        if(nums.length==0 || nums==null){
            return null;
        }
        int[] result=new int[nums.length];

        for(int i=0,j=1;i<nums.length-1;i++,j++){
            result[i]=nums[j];
        }
        result[nums.length-1]=nums[0];

        return result;
    }

    //107
    //check if an array of integers contains three increasing adjacent numbers.
    //{1,2,3,4,7}->true
    //null pointer
    static boolean increasing3Integers(int[] nums){
        if(nums.length<3 || nums==null){
            return false;
        }

        for(int i=0;i<nums.length-2;i++){
            if(nums[i]+1==nums[i+1] && nums[i+1]+1==nums[i+2]){
                return true;
            }
        }

        return false;
    }

    //108
    //add all the digits of a given positive integer until the result has a single digit
    //25->7
    static int addNumber(Integer number){
        int sum=0;
        while(number>0){
            int reminder = number % 10;
            number = number / 10;
            sum += reminder;
        }
        return sum;
    }
    static int addNumber2(Integer number) {
        if(number==0) return 0;
        return number % 10 + addNumber2(number / 10);
    }

    //09
    //form a staircase shape of n coins where every k-th row must have exactly k coins.
    //3coin 2 stair
    static int rowCount(int n){
        int row=0;
        for(row=0; row<n;row++) {
            while(row * (1 + row) / 2 < n){
                continue;
            }
            return row;
        }
        return row;

    }

    //10
    //check whether an given integer is a power of 4 or not
    //64->true
    ////Math.log()
    ////Math.floor()
    ////4.3->4
    ////-2.3->-3
    static boolean ifPower4(int num){
        double i=Math.log(num)/Math.log(4);
        if(i==Math.floor(i)){
            return true;
        }
        return false;
    }


    //11
    //add two numbers without using any arithmetic operators.
    //2+3->5
    static int addNumber(int a, int b){
        while(b>0){
            a++;
            b--;
        }
        return a;
    }

    //112
    //compute the number of trailing zeros in a factorial.
    //5! -> 1
    static int countZero(int num){
        int sum=fac(num);
        int count=0;
        while(sum%10==0){
            count++;
            sum=sum/10;
        }
        return count;
    }

    static int countZero2(int num){
        int sum=1;
        int count=0;

        for(int i=1;i<=num;i++){
            sum=i*sum;
        }
        while(sum%10==0){
            count++;
            sum=sum/10;
        }
        return count;

    }

    static int fac(int num){
        if(num==0 || num==1){
            return 1;
        }
        return fac(num-1)*num;
    }





    public static void main(String[] args){
        int[] test1={10,10,20,5,6,7};
        int[] test4={9,10,30,4,4,4,10};
        int[] test2=null;
        int[] test3={1,2,3};

        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{1};
     // System.out.println(W3resource.arrayDiffer(arr1,arr2));

      // System.out.println(W3resource.valueGreater20(test1));
      //System.out.println(W3resource.check10or30(test3));
      // System.out.println(Arrays.toString(W3resource.arrayAfter10(test4)));
//       System.out.println(W3resource.startEqualsEnd(test2));
     //   System.out.println(W3resource.increasing3Integers(test2));
       // System.out.println(W3resource.addNumber2(0));
    //    System.out.println(W3resource.rowCount(5));
       // System.out.println(W3resource.ifPower4(63));
        //System.out.println(W3resource.addNumber(2,3));
        System.out.println(W3resource.countZero2(10));
       // System.out.println(W3resource.fac(7));
    }
}
