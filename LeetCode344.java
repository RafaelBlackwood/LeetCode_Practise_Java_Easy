public class LeetCode344 {
    public static void main(String[] args) {
        //Write a function that reverses a string.
        // The input string is given as an array of characters s.
        //You must do this by modifying the input
        // array in-place with O(1) extra memory.
        //
        //Example 1:
        //Input: s = ["h","e","l","l","o"]
        //Output: ["o","l","l","e","h"]

        //Example 2:
        //Input: s = ["H","a","n","n","a","h"]
        //Output: ["h","a","n","n","a","H"]
        //

        char[] s = {'h','e','l','l','o'};
        Solution.reverseString(s);
    }

    static class Solution{
        public static void reverseString(char[] s) {

            int right = s.length - 1;
            for (int left = 0; left < s.length/2; left++) {
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                right --;
            }
            for (int i = 0; i < s.length; i++) {
                System.out.print(s[i]);
            }
        }
    }
}
