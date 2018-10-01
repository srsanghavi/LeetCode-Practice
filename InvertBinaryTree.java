// https://leetcode.com/problems/invert-binary-tree/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode swaptemp,temp=root;
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        swaptemp = root.left;
        root.left = root.right;
        root.right = swaptemp;
        return root;
    }
}
