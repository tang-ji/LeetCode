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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        find(root, result, new ArrayList<Integer>(), sum);
        return result;
    }
    
    protected void find(TreeNode N, List<List<Integer>> L, List<Integer> l, int sum) {
        if(N == null) return;
        l.add(N.val);
        if(sum == N.val && N.left == null && N.right == null) L.add(new ArrayList<Integer>(l));
        find(N.left, L, l, sum - N.val);
        find(N.right, L, l, sum - N.val);
        l.remove(l.size() - 1);
    }
}