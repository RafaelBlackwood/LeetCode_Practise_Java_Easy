public class LeetCode264 {
    public static void main(String[] args){
        /*
        An ugly number is a positive integer which does
        not have a prime factor other than 2, 3, and 5.
        Given an integer n, return true if n is an ugly number.

        Example 1:
        Input: n = 6
        Output: true
        Explanation: 6 = 2 × 3
        Example 2:
        Input: n = 1
        Output: true
        Explanation: 1 has no prime factors.
        Example 3:
        Input: n = 14
        Output: false
        Explanation: 14 is not ugly since it includes the prime factor 7.

         */

        int n =6;

        System.out.println(Solution.isUgly(n));
    }

    static class Solution {
        public static boolean isUgly(int n) {
            if(n == 1 || n == 2 || n == 3 || n == 5) return true;
            boolean isUgly = false;
            while(n != 0){
                if(n%2 == 0) {n/=2; isUgly = true;}
                else if(n%3 == 0){n/=3 ; isUgly = true;}
                else if(n%5 == 0) {n/=5; isUgly = true;}
                else if(n == 1 ) return isUgly;
                else  {
                    isUgly = false;
                    break;
                }
            }
            return isUgly;
        }

        //2
        /*
        if (n <= 0) return false;
        int[] primes = {2, 3, 5};
        for (int p : primes) {
            while (n % p == 0) n /= p;
        }
        return n == 1;
         */
    }
}
