import static java.lang.Math.max;
import static java.lang.Math.min;

public class LeetCode111 {
    public static void main(String[] args){
        /*
        Given a binary tree, find its minimum depth.
        The minimum depth is the number of nodes
        along the shortest path from the root node down to the nearest leaf node.

        Note: A leaf is a node with no children.

        Example 1:
        Input: root = [3,9,20,null,null,15,7]
        Output: 2
        Example 2:
        Input: root = [2,null,3,null,4,null,5,null,6]
        Output: 5
         */
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

    static class Solution{
        public int minDepth(TreeNode root){

            if(root == null) return 0;
            TreeNode left = root.left;
            TreeNode right = root.right;
            if (left == null && right == null) return 1;
            if (left == null) return 1 + minDepth(right);
            if (right == null) return 1 + minDepth(left);
            return 1 + Math.min(minDepth(left), minDepth(right));

        }
    }
}
