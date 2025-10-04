import java.util.HashSet;

public class LeetCode242 {
    public static void main(String[] args) {
        //Given two strings s and t, return true if t is an anagram of s, and false otherwise.
        //Example 1:
        //
        //Input: s = "anagram", t = "nagaram"
        //Output: true
        //Example 2:
        //Input: s = "rat", t = "car"
        //Output: false

        String s ="anagram";
        String t = "nagaram";

        System.out.println(Solution.isAnagram(s,t));
    }

    static class Solution {
        public static boolean isAnagram(String s, String t) {
            if(s.length() != t.length()) return false;

           int[] frequency = new int[26];

           for(char c : s.toCharArray()) frequency[c - 'a']++;
           for(char c : t.toCharArray()) frequency[c - 'a']--;

           for(int i : frequency) if(i != 0) return false;
           return true;
        }
    }
}
