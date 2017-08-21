import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        BigDecimal num1 = new BigDecimal(10.1);
        num1.toString();
        Integer num2 = new Integer(10);
        BigDecimal num3 = new BigDecimal(num2);
        System.out.println(num1.compareTo(num3));

    }

    public static int longestValidParentheses(String s) {
        Stack stack = new Stack();
        int counter = 0;
        int result = 0;
        boolean warn = false;

        int sequenceValue = 0;

        for (int i = 0; i < s.length(); i++) {
            String currentString = String.valueOf(s.charAt(i));
            if (stack.empty()) {
                if (currentString.equals("(")) {
                    stack.push(currentString);
                } else {
                    continue;
                }
            } else {
                if (currentString.equals("(")) {
                    stack.push(currentString);
                    sequenceValue++;
                } else {
                    warn = true;
                    if (stack.peek().equals("(")) {
                        counter += 2;
                        stack.pop();
                        sequenceValue--;
                    } else {
                        counter = 0;
                    }
                }
            }
            result = counter > result ? counter : result;
        }
        return result;
    }
}
