public class LeetCode104 {
    public static void main(String[] args) {
        /*
        Given the root of a binary tree, return its maximum depth.
        A binary tree's maximum depth is the number of nodes along
        the longest path from the root node down to the farthest leaf node.
        Input: root = [3,9,20,null,null,15,7]
        Output: 3

        Example 2:
        Input: root = [1,null,2]
        Output: 2
         */
    }

     class TreeNode {
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


     class Solution {
        public int maxDepth(TreeNode root) {
            int left_depth = 0;
            int right_depth = 0;

            if (root == null) return 0;
            if (root.left != null) {
                left_depth = maxDepth(root.left);
            }
            if (root.right != null) {
                right_depth = maxDepth(root.right);
            }

            return 1+ Math.max(left_depth, right_depth);
        }
    }
}
