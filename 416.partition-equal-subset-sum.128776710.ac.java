class Solution {
    public boolean canPartition(int[] nums) {
        if(nums == null) return true;
        int sum = 0;
        for(int i : nums) sum += i;
        if(sum % 2 == 1) return false;
        // (sum % 2 == 1) ==> (sum & 1 == 1)
        
        boolean[] dp = new boolean[sum / 2 + 1];
        dp[0] = true;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = sum / 2; j >= nums[i]; j--) {
               dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[sum / 2];
    }
}