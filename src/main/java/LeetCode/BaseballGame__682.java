package LeetCode;

import java.util.LinkedList;
//"+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
//"D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
//"C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.

public class BaseballGame__682 {
        public int calPoints(String[] ops) {
            //store sum score
            int sum = 0;
            //store round's sum score
            LinkedList<Integer> list = new LinkedList<>();
            for (String op : ops) {
                //not ==
                if (op.equals("C")) {
                     // list.removeLast()------Removes and returns the last element from this list.
                    sum =sum - list.removeLast();
                }
                else if (op.equals("D")) {
                    // list.peekLast()-------- Retrieves, but does not remove, the last element of this list.
                    list.add(list.peekLast() * 2);
                    sum =sum + list.peekLast();
                }
                else if (op.equals("+")) {
                    list.add(list.peekLast() + list.get(list.size() - 2));
                    sum =sum + list.peekLast();
                }
                else {
                    list.add(Integer.parseInt(op));
                    sum =sum + list.peekLast();
                }
            }
            return sum;
        }

        public static void main(String[] args){
            BaseballGame__682 bb=new BaseballGame__682();
            String[] strings=new String[]{"5","2","C","D","+"};
            int c=bb.calPoints(strings);
            System.out.println(c);
        }
}

