package stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Balanced {

    //    For each case, print 'true' if the string is balanced, 'false' otherwise.
    //    A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2.
    //    if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.
    //    Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
    //    Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
    //    Given a string, determine if it is balanced or not.
        public boolean isBalancedString(String input) {

            char[] charInput = input.toCharArray();
            Map<Character, Character> charMap = new HashMap<>();
            charMap.put('(', ')');
            charMap.put('[', ']');
            charMap.put('{', '}');
            Stack<Character> balanced = new Stack<>();
            for (char c : charInput) {
                if (charMap.containsKey(c)) {
                    balanced.push(c);
                } else if (balanced.empty() || charMap.get(balanced.pop()) != c) {
                    balanced.push(c);
                    break;
                }
            }
            return balanced.isEmpty();
        }


}
