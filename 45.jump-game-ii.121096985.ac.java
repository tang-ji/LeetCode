class Solution {
    public int jump(int[] nums) {
        int ret = 0, max = 0, pos = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (pos == i) {
                ret++;
                pos = max;
            }
        }
        return ret;
    }
}