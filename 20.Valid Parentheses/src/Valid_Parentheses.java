package Valid_Parentheses;

import java.util.Stack;

public class Valid_Parentheses {
        public static void main(String[] args) {
                /*
                Given a string s containing just the characters '(', ')', '{', '}',
                '[' and ']', determine if the input string is valid.
                An input string is valid if:

                Open brackets must be closed by the same type of brackets.
                Open brackets must be closed in the correct order.
                Every close bracket has a corresponding open bracket of the same type.

                Example 1:
                Input: s = "()"
                Output: true

                Example 2:
                Input: s = "()[]{}"
                Output: true

                Example 3:
                Input: s = "(]"
                Output: false
                 */

                String s = "()[]{";
                boolean flaq = true;
                System.out.println(isValid(s));
        }
       public static boolean isValid(String s) {

               boolean flag = true;
               if (s.length() % 2 != 0) return false;  // Нечетное количество скобок, парные быть не могут
               else {
                       Stack<Character> stack = new Stack<>();  // Используем стек для сопоставления скобок

                       for (int i = 0; i < s.length(); i++) {
                               char currentChar = s.charAt(i);

                               if (currentChar == '(' || currentChar == '[' || currentChar == '{')
                               {
                                       stack.push(currentChar);
                               }
                               else if (currentChar == ')' || currentChar == ']' || currentChar == '}')
                               {
                                       if (stack.isEmpty()) // то есть у нас есть закрывающая скобка без соответствующей открывающей
                                       {
                                               return false;
                                       }
                                       char topChar = stack.pop();

                                       if ((currentChar == ')' && topChar != '(') ||
                                               (currentChar == ']' && topChar != '[') ||
                                               (currentChar == '}' && topChar != '{'))
                                       {
                                               flag = false;  // Несоответствие открывающей и закрывающей скобок
                                               break;
                                       }
                               }
                       }

                       if (!stack.isEmpty()) {
                               flag = false;  // Не все открывающие скобки имеют пару
                       }
               }

               return flag;

       }
}

