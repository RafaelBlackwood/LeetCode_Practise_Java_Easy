public class LeetCode1662 {
    public static void main(String[] args) {
        //Given two string arrays word1 and word2, return true
        // if the two arrays represent the same string, and false otherwise.
        //
        //A string is represented by an array if the array
        // elements concatenated in order forms the string.
        //
        //Example 1:
        //Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
        //Output: true
        //Explanation:
        //word1 represents string "ab" + "c" -> "abc"
        //word2 represents string "a" + "bc" -> "abc"
        //The strings are the same, so return true.
        //Example 2:
        //Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
        //Output: false
        //Example 3:
        //Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
        //Output: true
    }

    static class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            StringBuilder one = new StringBuilder();
            StringBuilder two = new StringBuilder();

            for (int i = 0; i < word1.length; i++) {
                one.append(word1[i]);
            }
            for (int i = 0; i < word2.length; i++) {
                two.append(word2[i]);
            }
            return one.toString().equals(two.toString());

            //Solution 2
            //return (String.join("", word1)).equals(String.join("", word2));
        }
    }
}
