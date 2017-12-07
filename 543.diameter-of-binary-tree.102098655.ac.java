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
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int ll = longeur(root.left), lr = longeur(root.right);
        return Math.max(ll + lr, Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
    }
    
    public int longeur (TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(longeur(root.left), longeur(root.right));
    }
}