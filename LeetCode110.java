public class LeetCode110 {
    public static void main(String[] args) {

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Solution {
        public boolean isBalanced(TreeNode root) {

            return checkHeight(root) != -1;
        }
        public int checkHeight(TreeNode root) {
            if (root == null) return 0;

            int leftHeight = checkHeight(root.left);
            if (leftHeight == -1) return -1;
            int rightHeight = checkHeight(root.right);
            if(rightHeight == -1) return -1;
            if (Math.abs(leftHeight - rightHeight) > 1) return -1;
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
