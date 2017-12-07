class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] l = new boolean[nums.length + 2];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= nums.length && nums[i] > 0) l[nums[i]] = true;
        }
        for(int j = 1; j < nums.length + 2; j++) {
            if(l[j] == false) return j;
        }
        return nums.length + 2;
    }
}