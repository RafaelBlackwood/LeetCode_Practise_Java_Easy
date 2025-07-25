import java.util.ArrayList;
import java.util.List;

public class LeetCode119 {
    public static void main(String[] args) {

        /*
        Given an integer rowIndex, return the rowIndexth
        (0-indexed) row of the Pascal's triangle.
        In Pascal's triangle, each number is the sum of
        the two numbers directly above it as shown:
        Example 1:
        Input: rowIndex = 3
        Output: [1,3,3,1]
        Example 2:
        Input: rowIndex = 0
        Output: [1]
        Example 3:
        Input: rowIndex = 1
        Output: [1,1]
         */
    }

    static class Solution
    {
        public List<Integer> getRow(int rowIndex) {
            List<List<Integer>> result = new ArrayList<>();
            for(int i = 0; i <= rowIndex; i++) {
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
            return result.get(rowIndex);
        }
    }
}
