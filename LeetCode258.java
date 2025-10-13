import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode258 {
    public static void main(String[] args) {
        /*
        Given an integer num, repeatedly add all its digits until
        the result has only one digit, and return it.

        Example 1:
        Input: num = 38
        Output: 2
        Explanation: The process is
        38 --> 3 + 8 --> 11
        11 --> 1 + 1 --> 2
        Since 2 has only one digit, return it.

        Example 2:
        Input: num = 0
        Output: 0
        Constraints:
        0 <= num <= 231 - 1
         Follow up: Could you do it without any loop/recursion in O(1) runtime?
         */
        int num = 38;

        System.out.println(Solution.addDigits(num));
    }

    static class Solution {
         public static int addDigits(int num) {
            if(num >=0 && num<=9) return num;

            int res =0;
            while(num!=0){
                res+=num%10;
                num=num/10;
                if(res>9 && num == 0) {
                    num = res;
                    res = 0;
                }
            }
            return res;
         }
    }
}
