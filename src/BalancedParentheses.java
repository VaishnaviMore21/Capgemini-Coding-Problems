
import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // push opening bracket
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false; // no matching opening

                char top = stack.pop();
                if (!matches(top, ch)) return false; // mismatched pair
            }
        }

        return stack.isEmpty(); // true if all brackets matched
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String str1 = "{[()]}";
        String str2 = "{[(])}";

        System.out.println(str1 + " -> " + (isBalanced(str1) ? "Balanced" : "Not Balanced"));
        System.out.println(str2 + " -> " + (isBalanced(str2) ? "Balanced" : "Not Balanced"));
    }
}
