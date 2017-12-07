class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length;
        while(l < r) {
            int i = l + ((r - l) >> 1);
            if(nums[i] < target) l = i + 1;
            else r = i;
        }
        return l;
    }
}