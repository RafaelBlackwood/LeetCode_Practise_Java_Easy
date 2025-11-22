import java.util.ArrayList;
import java.util.List;

public class LeetCode257 {
    public static void main(String[] args){
        /*
        Given the root of a binary tree, return all root-to-leaf paths in any order.
        A leaf is a node with no children.
        Example 1:
        Input: root = [1,2,3,null,5]
        Output: ["1->2->5","1->3"]
        Example 2:
        Input: root = [1]
        Output: ["1"]
        Constraints:
        The number of nodes in the tree is in the range [1, 100].
        -100 <= Node.val <= 100
         */

        TreeNode node4 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3, node4, null);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode root = new TreeNode(1, null, node2);


        Solution sol = new Solution();
        List<String> result = sol.binaryTreePaths(root);

        System.out.println(result);
    }


    //Definition for a binary tree node.
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

        public void tree(TreeNode node, String path, List<String> res) {
            if(node == null) return;
            path += node.val;

            if(node.left == null && node.right == null)
            {
                res.add(path);
            }
            else {
                tree(node.left, path+"->", res);
                tree(node.right, path+"->", res);
            }

        }

        public List<String> binaryTreePaths(TreeNode root) {

            List<String> result = new ArrayList<>();
            if (root == null) {
                return result;
            }

            tree(root, "", result);
            return result;
        }
    };
}
