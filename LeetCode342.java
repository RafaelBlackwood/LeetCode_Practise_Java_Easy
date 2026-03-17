public class LeetCode342 {
    public static void main(String[] args) {
        /*
        Given an integer n, return true if it is a power of four. Otherwise, return false.
        An integer n is a power of four, if there exists an integer x such that n == 4x.
    
        Example 1:
        Input: n = 16
        Output: true
    
        Example 2:
        Input: n = 5
        Output: false
    
        Example 3:
        Input: n = 1
        Output: true

         */

        int num = 16;
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfFour(num));
    }

    static class Solution {
        public boolean isPowerOfFour(int n) {
            for(int i = 0; i < n; i++){
                if (Math.pow(4, i) == n){
                    return true;
                }
            }
            return false;
        }
    }
}
