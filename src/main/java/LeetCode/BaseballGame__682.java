package LeetCode;

import java.util.LinkedList;
import java.util.Stack;
//"+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
//"D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
//"C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.

public class BaseballGame__682 {
        static int calPoints(String[] ops) {
          Stack<Integer> stack=new Stack();
          int sum=0;

          for(String op : ops){
              if(op.equals("C")){
                  stack.pop();
              }
              else if(op.equals("D")){
                  stack.push(2*stack.peek());
              }
              else if(op.equals("+")){
                  int top=stack.pop();
                  int newtop=stack.peek()+top;
                  stack.push(top);
                  stack.push(newtop);
              }
              else{
                  stack.push(Integer.valueOf(op));
              }

          }

            for(Integer s : stack){
                sum+=s;
            }
            return sum;

        }

        public static void main(String[] args){
            String[] strings=new String[]{"5","2","C","D","+"};
            int c=BaseballGame__682.calPoints(strings);
            System.out.println(c);
        }
}

