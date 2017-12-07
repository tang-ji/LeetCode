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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(maxDepth(root.left) - maxDepth(root.right)) >= 2) return false;
        if(!isBalanced(root.left) || !isBalanced(root.right)) return false;
        return true;
    }
    
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return(Math.max(maxDepth(root.left), maxDepth(root.right)) + 1);
    }
}