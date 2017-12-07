class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            while(i+j < nums.length && nums[i+j] == val) {
                j++;
            }
            if(i+j >= nums.length) break;
            nums[i] = nums[i+j];
        }
        return nums.length - j;
    }
}