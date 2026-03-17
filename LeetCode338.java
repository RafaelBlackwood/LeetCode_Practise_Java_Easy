public class LeetCode338 {
    public static void main(String[] args) {
        /*
        Given an integer n, return an array ans of length
        n + 1 such that for each i (0 <= i <= n), ans[i]
        is the number of 1's in the binary representation of i.

        Example 1:
        Input: n = 2
        Output: [0,1,1]
        Explanation:
        0 --> 0 (no 1s)
        1 --> 1 (one 1)
        2 --> 10 (one 1)

        Example 2:
        Input: n = 5
        Output: [0,1,1,2,1,2]
        Explanation:
        0 --> 0 (no 1s)
        1 --> 1 (one 1)
        2 --> 10 (one 1)
        3 --> 11 (two 1s)
        4 --> 100 (one 1)
        5 --> 101 (two 1s)
         */

        int n = 5;
        Solution solution = new Solution();
        System.out.println(solution.countBits(n));
    }

    static class Solution {
        public int[] countBits(int n) {
            int[] ans = new int[n+1];
            for (int i = 0; i<=n ; i++){
                ans[i] = Integer.bitCount(i);
            }
            return ans;
        }
    }   
}   