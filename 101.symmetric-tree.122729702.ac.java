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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, root.right);
    }
    
    public boolean helper(TreeNode l, TreeNode r) {
        if(l == null && r == null) return true;
        if((l != null && r == null) || (l == null && r != null) || (l.val != r.val)) return false;
        if(helper(l.left, r.right) && helper(l.right, r.left)) return true;
        return false;
    }
}