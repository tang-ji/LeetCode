class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 0) if(max == 0) return false;
            max = Math.max(max, nums[i]);
            max--;
        }
        return true;
    }
}