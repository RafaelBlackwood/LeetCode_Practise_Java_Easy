public class LeetCode2011 {
    public static void main(String[] args) {
        //There is a programming language with only
        // four operations and one variable X:
        //
        //++X and X++ increments the value of the variable X by 1.
        //--X and X-- decrements the value of the variable X by 1.
        //Initially, the value of X is 0.
        //
        //Given an array of strings operations containing a list
        // of operations, return the final value of X after
        // performing all the operations.
        //
        //Example 1:
        //Input: operations = ["--X","X++","X++"]
        //Output: 1
        //Explanation: The operations are performed as follows:
        //Initially, X = 0.
        //--X: X is decremented by 1, X =  0 - 1 = -1.
        //X++: X is incremented by 1, X = -1 + 1 =  0.
        //X++: X is incremented by 1, X =  0 + 1 =  1.
        //Example 2:
        //Input: operations = ["++X","++X","X++"]
        //Output: 3
        //Explanation: The operations are performed as follows:
        //Initially, X = 0.
        //++X: X is incremented by 1, X = 0 + 1 = 1.
        //++X: X is incremented by 1, X = 1 + 1 = 2.
        //X++: X is incremented by 1, X = 2 + 1 = 3.
        //Example 3:
        //Input: operations = ["X++","++X","--X","X--"]
        //Output: 0
        //Explanation: The operations are performed as follows:
        //Initially, X = 0.
        //X++: X is incremented by 1, X = 0 + 1 = 1.
        //++X: X is incremented by 1, X = 1 + 1 = 2.
        //--X: X is decremented by 1, X = 2 - 1 = 1.
        //X--: X is decremented by 1, X = 1 - 1 = 0.
        Solution solution = new Solution();
        String[] operations = {"--X","X++","X++"};

        System.out.println(solution.finalValueAfterOperations(operations));
    }

    static class Solution{
        public int finalValueAfterOperations(String[] operations) {
            int result =0;

            for(int i=0;i<operations.length;i++) {
                for (int j = 0; j < operations[i].length(); j++) {
                    if (operations[i].charAt(j) == '+') {
                        result += 1;
                        break;
                    } else if (operations[i].charAt(j) == '-') {
                        result -= 1;
                        break;
                    }
                }
            }
            return result;

            //Solution 2
            //int x = 0;
            //for(String o : operations) x += (44 - o.charAt(1));
           // return x;
        }
    }
}
