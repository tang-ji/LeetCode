class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0 || nums[nums.length - 1] < target) return new int[]{-1, -1};
        int k = searchFirstHigherIndex(nums, target);
        if(nums[k] != target) return new int[]{-1, -1};
        return new int[]{k, searchFirstHigherIndex(nums, target + 1) - 1};
    }
    
    public int searchFirstHigherIndex(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n, i = r / 2;
        while(l < r) {
            if(nums[i] < target) l = i + 1;
            else r = i;
            i = (l + r) / 2;
        }
        return l;
    }
}