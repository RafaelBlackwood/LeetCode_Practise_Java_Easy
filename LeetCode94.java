import java.util.ArrayList;
import java.util.List;

public class LeetCode94 {
    public static void main(String[] args) {

    }


    /*Definition for a binary tree node. */
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
        public List<Integer> inorderTraversal(TreeNode root) {

            List<Integer> res = new ArrayList<>();

            if(root == null) return res;

            if (root.left != null) {
                res.addAll(inorderTraversal(root.left));
            }

            res.add(root.val);

            if (root.right != null) {
                res.addAll(inorderTraversal(root.right));
            }
            return res;
        }
    }
}
