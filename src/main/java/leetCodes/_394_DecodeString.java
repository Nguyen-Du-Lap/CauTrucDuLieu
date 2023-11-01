package leetCodes;

import java.util.Stack;

public class _394_DecodeString {
    public String decode(String s) {
        Stack<Character> stack = new Stack<Character>();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ']') {
                stack.push(c);
            } else {
                String temp = "";
                while (stack.peek() != '[') {
                    temp = stack.pop() + temp;
                }
                stack.pop();
                int size = Integer.parseInt(String.valueOf(stack.pop()));
                String sNew = "";
                for (int j = 0; j < size; j++) {
                    sNew += temp;
                }
                if (stack.isEmpty()) return sNew;
                for (int k = 0; k < sNew.length(); k++) {
                    stack.push(sNew.charAt(k));
                }


            }

        }

        return result;
    }

    public static void main(String[] args) {
        _394_DecodeString decodeString = new _394_DecodeString();
        System.out.println(decodeString.decode("3[ab2[cd]e]"));
    }
}
