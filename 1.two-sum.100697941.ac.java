public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j != i && nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}