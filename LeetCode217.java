import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class LeetCode217 {
    public static void main(String[] args) {
        /*
        Given an integer array nums, return true
        if any value appears at least twice in the
        array, and return false if every element is distinct.

        Example 1:
        Input: nums = [1,2,3,1]
        Output: true
        Explanation:
        The element 1 occurs at the indices 0 and 3.
        Example 2:
        Input: nums = [1,2,3,4]
        Output: false
        Explanation:
        All elements are distinct.
        Example 3:
        Input: nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true
         */
    }

    static class Solution{
        public boolean containsDuplicate(int[] nums){
            boolean flag = false;
            /*
            //1 not optimal
            for(int i=0; i<nums.length; i++){

                for(int j=i+1; j<nums.length; j++){
                    if(nums[i] == nums[j]){
                        flag = true;
                        break;
                    }
                }
            }
            return flag;
             */
        //2 the most optimal:
            /*
        HashSet<Integer> num=new HashSet<>();
        for(int i:nums){
           if(num.contains(i))
             return true;
           else
             num.add(i);
        }
        return false;
             */

            //3 middle ground
            Arrays.sort(nums);
            for(int i = 1; i < nums.length; i++){
                if(nums[i] == nums[i-1]){
                    return true;
                }
            }
            return false;
        }
    }
}
