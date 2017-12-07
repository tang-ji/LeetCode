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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return SameTree(p, q);
    }
    
    public boolean SameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p == null && q != null) return false;
        else if(p != null && q == null) return false;
        else if(p.val == q.val) {
            if(SameTree(p.right, q.right) && SameTree(p.left, q.left)) return true;
            else return false;
        }
        return false;
    }
}