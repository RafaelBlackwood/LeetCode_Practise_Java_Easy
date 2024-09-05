class Solution {
    public static void main(String[] args) {
        /*
        Given an integer x, return true if x is a palindrome,and false otherwise.
        Example 1:
        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.
        Example 2:

        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
        Example 3:

        Input: x = 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
        */
        int x = -121;
        boolean a = isPalindrome(x);

        System.out.println(a);
    }

    public static boolean isPalindrome(int x) {
        StringBuilder palindrome = new StringBuilder(String.valueOf(x));
        if(palindrome.reverse().toString().equals(String.valueOf(x)))return true;

        return false;
    }
}
