public class Solution {
    public static void main(String[] args) {

        int[] nums = new int[]{-4,-2,1,4,8};

        findClosestNumber(nums);
    }

    public static int findClosestNumber(int[] nums) {

        int the_number= nums[0];

        for (int i : nums) {

            if( Math.abs(i) < Math.abs(the_number)){
                the_number = i;
            }
        }

        if(the_number < 0 && contains(nums, Math.abs(the_number))){
            return Math.abs(the_number);
        }
        else {
            return the_number;
        }

    }

    private static boolean contains(int[] nums, int value) {
        for (int num : nums) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}

