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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        if(root == null) return l;
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;

        while(cur!=null || !s.empty()){
            while(cur!=null){
                s.add(cur);
                cur = cur.left;
            }
            cur = s.pop();
            l.add(cur.val);
            cur = cur.right;
        }

        return l;
    }
}