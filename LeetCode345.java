import java.util.HashMap;

public class LeetCode345{
    public static void main(String[] args){
        /*
        Given a string s, reverse only all the vowels in the string and return it.
        The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower
        and upper cases, more than once. 
        
        Example 1:
        Input: s = "IceCreAm"
        Output: "AceCreIm"
        Explanation:
        The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

        Example 2:xw
        Input: s = "leetcode"
        Output: "leotcede"
        */

        Solution solution = new Solution();
        System.out.println(solution.reverseVowels("IceCreAm"));
        System.out.println(solution.reverseVowels("leetcode"));

    }

    static class Solution{
        public String reverseVowels(String s) {
            char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
            HashMap<Character, Integer> vowelMap = new HashMap<>(); 
            for(char character : s.toCharArray()){
                // save the index and the character of the vowel. Then reverse the values int the map but save the indexes. 
                // Then replace the characters in the string with the reversed values.)
                for(char vowel : vowels){
                    if(character == vowel){
                        vowelMap.put(character, s.indexOf(character));
                    }
                }
             
                return "";
            }
    }
            
}