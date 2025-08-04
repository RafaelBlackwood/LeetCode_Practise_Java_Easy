import java.util.HashMap;
import java.util.Map;

public class LeetCode205 {
    public static void main(String[] args) {
        /*
        Given two strings s and t, determine if they are isomorphic.
        Two strings s and t are isomorphic if the
        characters in s can be replaced to get t.
        All occurrences of a character must be replaced with
        another character while preserving the order of characters.
        No two characters may map to the same character,
        but a character may map to itself.

        Example 1:
        Input: s = "egg", t = "add"
        Output: true
        Explanation:
        The strings s and t can be made identical by:
        Mapping 'e' to 'a'.
        Mapping 'g' to 'd'.
        Example 2:
        Input: s = "foo", t = "bar"
        Output: false
        Explanation:
        The strings s and t can not be made identical
        as 'o' needs to be mapped to both 'a' and 'r'.
        Example 3:
        Input: s = "paper", t = "title"
        Output: true
         */

        String s = "foo";
        String t = "bar";

        System.out.println(Solution.isIsomorphic(s,t));
    }

    static class Solution {
        public static boolean isIsomorphic(String s, String t) {
            if(s.length() != t.length()) return false;
            Map<Character, Character> forwards = new HashMap<>();
            Map<Character, Character> backwards = new HashMap<>();

            for(int i = 0; i < s.length(); i++) {
                char c1 = s.charAt(i);
                char c2 = t.charAt(i);
                if(forwards.containsKey(c1))
                {
                    if(forwards.get(c1) !=c2) return false;
                } else forwards.put(c1, c2);
                if(backwards.containsKey(c2)) {
                    if(backwards.get(c2) != c1) return false;
                } else backwards.put(c2,c1);
            }
            return true;
        }
    }
}
