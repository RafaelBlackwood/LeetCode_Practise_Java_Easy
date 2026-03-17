public class LeetCode326 {
    public static void main(String[] args) {
        /*
        Given an integer n, return true if n is a power of three. 
        Otherwise, return false.

        An integer n is a power of three, if there exists an
         integer x such that n == 3x.

        Example 1:
        Input: n = 27
        Output: true
        Explanation: 27 = 33

        Example 2:
        Input: n = 0
        Output: false
        Explanation: There is no x where 3x = 0.

        Example 3:
        Input: n = -1
        Output: false
        Explanation: There is no x where 3x = (-1).
         */

        int n = 27;
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfThree(n));
    }

   
    static class Solution { 
        public boolean isPowerOfThree(int n){
            if(n==0) return false;
            if (n == 1) return true;
            if(n % 3 == 0){
                if(n == 3) return true;
                else return isPowerOfThree(n / 3);
            
            }
            return false;
        }

    }
}


/*
individual experience from the group work. Matrix is Face To Face interaction:
 - Group work consisted of brainstorming in the round table format
 - We had a total democratic approach to the problem solving, where everyone had an 
 equal say in the discussion and decision-making process.
 - We were not using any digital tools for our discussion, the only tools we used
 were physical equipment such as whiteboards and markers to jot down ideas and solutions.
*/