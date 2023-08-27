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

    static public boolean isPalindrome(int x) {
        //First solution
        /*
        StringBuilder pal = new StringBuilder();
        pal.append(x);
        String result = pal.toString();
        StringBuilder check = pal.reverse();

        if (x < 0) {
            return false;
        }

        return result.equals(check.toString());
         */

        //Second solution
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }
}
