import java.util.ArrayList;
import java.util.List;

public class LeetCode144 {
    public static void main(String[] args) {

        /*
        Given the root of a binary tree, return the preorder
        traversal of its nodes' values.
        Example 1:
        Input: root = [1,null,2,3]
        Output: [1,2,3]
        Example 2:
        Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
        Output: [1,2,4,5,6,7,3,8,9]
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
        List<Integer> result = sol.preorderTraversal(root);

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
            public List<Integer> preorderTraversal(TreeNode root) {

                List<Integer> res = new ArrayList<>();

                if (root == null) {
                    return res;
                }

                res.add(root.val);
                res.addAll(preorderTraversal(root.left));
                res.addAll(preorderTraversal(root.right));

                return res;
            }
        }
    }

