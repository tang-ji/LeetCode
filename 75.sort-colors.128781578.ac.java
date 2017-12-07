class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for(int i : nums) count[i]++;
        for(int j = 0; j < nums.length; j++) {
            if(j < count[0]) nums[j] = 0;
            else if(j < count[0] + count[1]) nums[j] = 1;
            else nums[j] = 2;
        }
    }
}