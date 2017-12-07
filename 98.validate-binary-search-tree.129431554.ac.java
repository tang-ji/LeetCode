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
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    
    protected boolean valid(TreeNode root, long max, long min) {
        if(root == null) return true;
        if(root.val <= min || root.val >= max) return false;
        if(valid(root.left, root.val, min) && valid(root.right, max, root.val)) return true;
        return false;
    }
}