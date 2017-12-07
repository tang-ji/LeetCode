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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> L = new ArrayList<>();
        helper(root, 0, L);
        Collections.reverse(L);
        return L;
    }
    
    public void helper(TreeNode h, int n, List<List<Integer>> L) {
        if(h != null) {
            if(L.size() <= n) L.add(new ArrayList<Integer>());
            L.get(n).add(h.val);
            helper(h.left, n + 1, L);
            helper(h.right, n + 1, L);
        }
    }
}