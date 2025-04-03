package String_Programs;

import java.util.Stack;

public class BalancedStringUsingStack {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();

        char[] chars = s.toCharArray();

        for (char ch : chars) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String test1 = "{[()]}";
        String test2 = "{[(])}";
        String test3 = "([{}])";

        System.out.println("Test 1: " + isBalanced(test1)); // true
        System.out.println("Test 2: " + isBalanced(test2)); // false
        System.out.println("Test 3: " + isBalanced(test3)); // true
    }
}
