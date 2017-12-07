/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int rob(TreeNode root) {
        if (root == null) return 0;
        return Math.max(root.val + robrest(root.left) + robrest(root.right), rob(root.left) + rob(root.right));
    }
    
    public int robrest(TreeNode root) {
        if (root == null) return 0;
        return rob(root.right) + rob(root.left);
    }
}