import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1773 {
    public static void main(String[] args) {
        //You are given an array items, where each items[i] = [typei, colori, namei]
        // describes the type, color, and name of the ith item. You are also given a
        // rule represented by two strings, ruleKey and ruleValue.
        //
        //The ith item is said to match the rule if one of the following is true:
        //
        //ruleKey == "type" and ruleValue == typei.
        //ruleKey == "color" and ruleValue == colori.
        //ruleKey == "name" and ruleValue == namei.
        //Return the number of items that match the given rule.
        //
        //
        //
        //Example 1:
        //
        //Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],
        // ["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
        //Output: 1
        //Explanation: There is only one item matching the given rule, which is
        // ["computer","silver","lenovo"].
        //Example 2:
        //
        //Input: items = [["phone","blue","pixel"],["computer","silver","phone"],
        // ["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
        //Output: 2
        //Explanation: There are only two items matching the given rule, which are
        // ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item
        // ["computer","silver","phone"] does not match.

        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        Solution solution = new Solution();

        System.out.println(solution.countMatches(items,"type","phone"));
    }

    static class Solution {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            String[] rules = {"type" , "colour", "name"};
            int count = 0;
            int j = -1;
            for (int i = 0; i < rules.length; i++) {
                if (rules[i].equals(ruleKey)) {
                    j = i;
                    break;
                }
            }
            if (j == -1) {
                return count;
            }

            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(j).equals(ruleValue)) {
                    count += 1;
                }
            }

            return count;
        }
    }
}
