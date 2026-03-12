public class LeetCode303 {
    public static void main(String[] args) {

        /*
        Given an integer array nums, handle multiple queries of the following type:

        Calculate the sum of the elements of nums between indices 
        left and right inclusive where left <= right.
        Implement the NumArray class:
        NumArray(int[] nums) Initializes the object
        with the integer array nums.
        int sumRange(int left, int right) 
        Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
        
        Example 1:
        Input
        ["NumArray", "sumRange", "sumRange", "sumRange"]
        [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
        Output
        [null, 1, -1, -3]
        Explanation
        NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
        numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
        numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
        numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
        */
     int[] nums = {-2, 0, 3, -5, 2, -1};
     NumArray obj = new NumArray(nums);

     int[] nums2 = {obj.sumRange(0, 2), obj.sumRange(2, 5), obj.sumRange(0, 5)};
     
     for(int i : nums2) {
         System.out.println(i);
     }
    }

    static class NumArray {
    private int[] numArray;

    public NumArray(int[] nums) {
        this.numArray = nums;
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i = left; i <= right; i++) {
            sum += numArray[i];
        }
        return sum;
    }
}

    /**
     * Your NumArray object will be instantiated and called as such:
     * NumArray obj = new NumArray(nums);
     * int param_1 = obj.sumRange(left,right);
     */
}
