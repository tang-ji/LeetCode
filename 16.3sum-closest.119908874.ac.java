class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length < 3) return 0;
        Arrays.sort(nums);
        int ret = nums[0] + nums[1] + nums[2], dif = Math.abs(ret - target), sum;
        for(int i = 0; i < nums.length; i++) {
            int l = i + 1, r = nums.length - 1;
            while(r > l) {
                sum = nums[i] + nums[l] + nums[r];
                if(Math.abs(sum - target) <= dif) {
                    ret = sum;
                    dif = Math.abs(sum - target);
                }
                if(sum == target) return sum;
                if(sum < target) {
                    l++;
                    continue;
                }
                if(sum > target) {
                    r--;
                    continue;
                }
            }
        }
        return ret; 
    }
}