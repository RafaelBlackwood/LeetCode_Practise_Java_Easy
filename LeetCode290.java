import java.util.HashMap;

public class LeetCode290 {
    public static void main(String[] args) {
        /*
        Given a pattern and a string s, find if s follows the same pattern.
        Here follow means a full match, such that there is a
        bijection between a letter in pattern and a non-empty word in s. Specifically:
        Each letter in pattern maps to exactly one unique word in s.
        Each unique word in s maps to exactly one letter in pattern.
        No two letters map to the same word, and no two words map to the same letter.

        Example 1:
        Input: pattern = "abba", s = "dog cat cat dog"
        Output: true
        Explanation:
        The bijection can be established as:
        'a' maps to "dog".
        'b' maps to "cat".

        Example 2:
        Input: pattern = "abba", s = "dog cat cat fish"
        Output: false

        Example 3:
        Input: pattern = "aaaa", s = "dog cat cat dog"
        Output: false
         */
        }

        static class Solution {
            public boolean wordPattern(String pattern, String s) {
                String[] words = s.split(" ");
                if (words.length != pattern.length()) return false;

                HashMap<Character, String> char_to_word = new HashMap<>();
                HashMap<String, Character> word_to_char = new HashMap<>();

                for (int i = 0; i < words.length; i++) {
                    Character ch = pattern.charAt(i);
                    String word = words[i];

                    if (char_to_word.containsKey(ch)) {
                        if (!char_to_word.get(ch).equals(word)) return false;
                        ;
                    }
                    if (word_to_char.containsKey(word)) {
                        if (!word_to_char.get(word).equals(ch)) return false;
                    }
                    if (!char_to_word.containsKey(ch) && !word_to_char.containsKey(word)) {
                        char_to_word.put(ch, word);
                        word_to_char.put(word, ch);
                    }
                }
                return true;
            }

    }
}


