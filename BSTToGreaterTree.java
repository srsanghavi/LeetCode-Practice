// https://leetcode.com/problems/convert-bst-to-greater-tree/description/

class Solution {
    int maximum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root == null) return root;
        convertBST(root.right);
        maximum += root.val;
        root.val = maximum;
        convertBST(root.left);
        return root;
        
    }
}
