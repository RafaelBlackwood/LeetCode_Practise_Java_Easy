
import java.util.Collection;
import java.util.Arrays;

public class LeetCode35 {

    public static void main(String[] args){
        /*
        Given a sorted array of distinct integers and a target value,
        return the index if the target is found.
        If not, return the index where it would be if it were inserted in order.

        You must write an algorithm with O(log n) runtime complexity.

        Example 1:
        Input: nums = [1,3,5,6], target = 5
        Output: 2

        Example 2:
        Input: nums = [1,3,5,6], target = 2
        Output: 1

        Example 3:
        Input: nums = [1,3,5,6], target = 7
        Output: 4
         */

        int[] nums = {1,3,5,6};

        int target = 2;

        System.out.println(Search_Insert_Position.searchInsert(nums,target));
    }

    static class Search_Insert_Position {


        public static int searchInsert(int[] nums, int target) {

            int low_point = 0;
            int high_point = nums.length - 1;

            while (low_point <= high_point) {
                int middle_index =low_point + (high_point - low_point) / 2;

                if (nums[middle_index] == target) {
                    return middle_index;
                } else if (nums[middle_index] < target) {
                    low_point = middle_index + 1;
                } else {
                    high_point = middle_index - 1;
                }
            }

            // At this point, low_point is the insertion point
            return low_point;
        }
    }

}
