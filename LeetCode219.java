import java.util.HashMap;

import static java.lang.Math.abs;


public class LeetCode219 {
    public static void main(String[] args) {
        /*
        Given an integer array nums and an integer k,
        return true if there are two distinct indices
        i and j in the array such that
        nums[i] == nums[j] and abs(i - j) <= k.

        Example 1:
        Input: nums = [1,2,3,1], k = 3
        Output: true

        Example 2:
        Input: nums = [1,0,1,1], k = 1
        Output: true

        Example 3:
        Input: nums = [1,2,3,1,2,3], k = 2
        Output: false
         */
    }

    static class Solution{
        public boolean containsDuplicate(int[] nums, int k){

            /*
            for(int i = 0; i < nums.length; i++){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[i] == nums[j]){
                        if(abs(j-i)<=k) return true;
                    }
                }
            }
             */
            if(nums.length <2) return false;

            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                if(map.containsKey(nums[i])){
                    if(i - map.get(nums[i])<=k)return true;
                }
                map.put(nums[i], i);
            }
            return false;
        }
    }
}
