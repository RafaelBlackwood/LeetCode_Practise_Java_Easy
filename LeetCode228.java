import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class LeetCode228 {
    public static void main(String[] args)
    {
        /*
        You are given a sorted unique integer array nums.
        A range [a,b] is the set of all integers from a to b (inclusive).
        Return the smallest sorted list of ranges that cover all the
        numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges,
        and there is no integer x such that x is in one of the ranges but not in nums.
        Each range [a,b] in the list should be output as:

        "a->b" if a != b
        "a" if a == b

        Example 1:
        Input: nums = [0,1,2,4,5,7]
        Output: ["0->2","4->5","7"]
        Explanation: The ranges are:
        [0,2] --> "0->2"
        [4,5] --> "4->5"
        [7,7] --> "7"
        Example 2:
        Input: nums = [0,2,3,4,6,8,9]
        Output: ["0","2->4","6","8->9"]
        Explanation: The ranges are:
        [0,0] --> "0"
        [2,4] --> "2->4"
        [6,6] --> "6"
        [8,9] --> "8->9"
         */
        int[] nums = new int[]{0,1,2,4,5,7};
        System.out.println(Solution.summaryRanges(nums));
    }

    //error, add number, not string, dont use string in general, just convert it when ou add to the array
    static class Solution {

        public static void push_ranges(List<String> res, int start_range, int end_range) {
            if(start_range != end_range) res.add(String.valueOf(start_range)+"->"+String.valueOf(end_range));
            else res.add(String.valueOf(start_range));
        }
        public static List<String> summaryRanges(int[] nums) {
            List<String> res = new ArrayList<String>();

            if(nums.length == 0) return res;

            int start_range = nums[0];
            int end_range = nums[0];
            for(int i = 1; i < nums.length; i++) {
                if(nums[i] == 1+nums[i-1]) {
                    end_range = nums[i];
                }
                else{ push_ranges(res,start_range, end_range);
                start_range = nums[i];
                end_range = nums[i];
                }
            }
            push_ranges(res,start_range, end_range);
            return res;
        }
    }
}
