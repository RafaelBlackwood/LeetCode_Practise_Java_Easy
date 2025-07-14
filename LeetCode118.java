import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {
    public static void main(String[] args) {
        /*
        Given an integer numRows, return the first
        numRows of Pascal's triangle.
        In Pascal's triangle, each number is the sum
        of the two numbers directly above it
        Example 1:
        Input: numRows = 5
        Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

        Example 2:
        Input: numRows = 1
        Output: [[1]]
         */
    }

    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
            for(int i = 0; i < numRows-1; i++) {
                List<Integer> temp = new ArrayList<>();
                for(int j = 0; j <= i; j++) {
                    if(j == 0 || j == i) {
                        temp.add(1);
                    }
                    else{
                        temp.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                    }
                }
                result.add(temp);
            }
            return result;
        }
    }
}
