package Easy;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));      // true
        System.out.println(isValid("()[]{}"));  // true
        System.out.println(isValid("(]"));      // false
        System.out.println(isValid("([])"));    // true
        System.out.println(isValid("([)]"));    // false
        System.out.println(isValid("("));       // false
        System.out.println(isValid("}"));       // false
        System.out.println(isValid("([]{})"));  // true
    }


    public static boolean isValid(String s) {
        char[] ss = s.toCharArray();
        Stack<Character> myStack = new Stack<>();

        char waiting = '\0';
        char output;

        for (int i = 0; i < ss.length; i++) {
            if ((ss[i] == '(') || (ss[i] == '[') || (ss[i] == '{')) {
                myStack.push(ss[i]);
            } else if ((ss[i] == ')') || (ss[i] == ']') || (ss[i] == '}')) {
                if (!myStack.empty()) {
                    if (ss[i] != waiting) {
                        return false;
                    }
                    myStack.pop();
                } else {
                    return false;
                }
            }
            if (!myStack.empty()) {
                output = myStack.peek();
                if (output == '(') waiting = ')';
                if (output == '{') waiting = '}';
                if (output == '[') waiting = ']';
            }
        }
        if (myStack.isEmpty())
            return true;
        else
            return false;
    }
}