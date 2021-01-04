package DesignPattern.FizzBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IntegerPredicates {
    static Predicate<Integer> isFuzzbuzz(){
        return integer -> integer%3==0 && integer%5==0;
    }

    static Predicate<Integer> isFuzz(){
        return integer -> integer%3==0;
    }

    static Predicate<Integer> isBuzz(){
        return integer -> integer%5==0;
    }

    static List<Integer> filterInteger(List<Integer> nums, Predicate<Integer> predicate){
        return nums.stream().filter(predicate).collect(Collectors.<Integer>toList());
    }

    public static void main(String[] args){
        List<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(15);
        nums.add(3);
        nums.add(5);
        System.out.println(filterInteger(nums,isFuzz()));
    }
}
