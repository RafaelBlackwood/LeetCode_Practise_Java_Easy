import java.util.ArrayList;

public class LeetCode283 {
    public static void main(String[] args) {
        //Given an integer array nums, move all 0's to
        // the end of it while maintaining the relative
        // order of the non-zero elements.
        //Note that you must do this in-place without making a copy of the array.
        //
        //Example 1:
        //Input: nums = [0,1,0,3,12]
        //Output: [1,3,12,0,0]
        //Example 2:
        //Input: nums = [0]
        //Output: [0]

        int[] nums = {0,1,0,3,12};

        Solution solution = new Solution();

    }

    static class Solution {
        public static void moveZeroes(int[] nums) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            int count = 0;
            int temp = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[count] = nums[i];
                    count++;
                }
            }
            for (; count < nums.length; count++) {
                nums[count] = 0;
            }
        }
    }
}
