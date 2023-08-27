import java.util.ArrayList;




public class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 11};
        int target = 22;

        int[] ind = TwoSum(nums, target);

        for (int i = 0; i < ind.length; i++) {
            System.out.println(ind[i]);
        }

    }

    static public int[] TwoSum(int[] nums, int target) {
        /*
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
           You may assume that each input would have exactly one solution, and you may not use the same element twice.
           You can return the answer in any order.
           Example 1:
           Input: nums = [2,7,11,15], target = 9
           Output: [0,1]
           Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
           Example 2:
           Input: nums = [3,2,4], target = 6
           Output: [1,2]
           Example 3:
           Input: nums = [3,3], target = 6
           Output: [0,1]
         */

        //First Solution
       /*
         ArrayList<Integer> numbers = new ArrayList<>();
        boolean flag = false;

        for(int i=0; i<nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    numbers.add(i);
                    numbers.add(j);
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }

    // Convert ArrayList to an array of int indices and save elements into an array
        int[] indices = new int[numbers.size()];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = numbers.get(i);
        }

        return indices;
        */

        //Second solution

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) return new int[]{i, j};
            }
        }

        return null;
    }
}