package LeetCode;

import java.util.Stack;

public class VaildBrackets {


    public boolean isValid1(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i<s.length(); i++) {
            // Push any open parentheses onto stack
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            // Check stack for corresponding closing parentheses, false if not valid
            else if(s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(')
                stack.pop();
            else if(s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[')
                stack.pop();
            else if(s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{')
                stack.pop();
            else
                return false;
        }
        // return true if no open parentheses left in stack
        return stack.empty();
    }

    public static void main(String[] args){
        VaildBrackets vaildBrackets=new VaildBrackets();
        boolean a=vaildBrackets.isValid1("(){}");
        boolean b=vaildBrackets.isValid1("abc");
        boolean c=vaildBrackets.isValid1("((((()");
        boolean d=vaildBrackets.isValid1("");
        boolean e=vaildBrackets.isValid1("({})");
        boolean f=vaildBrackets.isValid1("([)]");
        System.out.println(f);
    }
}
