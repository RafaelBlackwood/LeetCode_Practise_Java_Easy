import java.util.ArrayList;
import java.util.List;

public class LeetCode145 {
    public static void main(String[] args) {

        /*
        Given the root of a binary tree, return the postorder
        traversal of its nodes' values.
        Example 1:
        Input: root = [1,null,2,3]
        Output: [3,2,1]
        Example 2:
        Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
        Output: [4,6,7,5,2,9,8,3,1]
        Example 3:
        Input: root = []
        Output: []
        Example 4:
        Input: root = [1]
        Output: [1]
         */
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode root = new TreeNode(1, null, node2);

        Solution sol = new Solution();
        List<Integer> result = sol.postorderTraversal(root);

        System.out.println(result);

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    static class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            if (root == null) {
                return res;
            }

            res.addAll(postorderTraversal(root.left));
            res.addAll(postorderTraversal(root.right));
            res.add(root.val);

            return res;
        }
    }
}

