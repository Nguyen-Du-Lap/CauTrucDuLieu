package leetCodes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _20_ValidParentheses {
    public boolean isValue(String s) {
        Stack<Character> stack = new Stack<Character>();
        if(s == null || s.equals("")) return false;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }else {
                if(stack.isEmpty()) return false;
                char peek = stack.peek();
                if((c == ')' && peek == '(')
                        || (c == '}' && peek == '{')
                        || (c == ']' && peek == '[')) {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        _20_ValidParentheses validParentheses = new _20_ValidParentheses();
        System.out.println(validParentheses.isValue("(){}"));
        System.out.println(validParentheses.isValue(")){}"));
        System.out.println(validParentheses.isValue("({})"));
        System.out.println(validParentheses.isValue(""));
        System.out.println(validParentheses.isValue("({}]"));
    }
}
