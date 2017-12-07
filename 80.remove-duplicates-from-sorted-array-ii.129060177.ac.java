class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2) return nums.length;
        int j = 0, count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[j]) {
                nums[++j] = nums[i];
                count = 1;
            }
            else if(count == 1) {
                nums[++j] = nums[i];
                count++;
            }
        }
        return j + 1;
    }
}