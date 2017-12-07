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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return helper(nums, 0, nums.length - 1);
    }
    
    public TreeNode helper(int[] nums, int low, int high) {
        if(low > high) return null;
        int m = low + (high - low) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = helper(nums, low, m - 1);
        root.right = helper(nums, m + 1, high);
        return root;
    }
}