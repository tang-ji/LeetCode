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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root != null && root.right == null && root.left == null && sum == root.val) return true;
        if(root != null && (hasPathSum(root.right, sum - root.val) || hasPathSum(root.left, sum - root.val))) return true;
        return false;
    }
    
}