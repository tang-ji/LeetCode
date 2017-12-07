class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> L = new ArrayList<List<Integer>>();
        if(nums.length < 3) return L;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            if(i != 0 && nums[i] == nums[i-1]) continue;
            int l = i + 1, r = nums.length - 1;
            while(r > l) {
                if((l != i + 1 && nums[l] == nums[l-1])) {
                    l++;
                    continue;
                }
                if((r != nums.length - 1 && nums[r] == nums[r+1])) {
                    r--;
                    continue;
                }
                if (nums[i] + nums[l] + nums[r] == 0) {
                    L.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[l], nums[r])));
                    l++;
                    r--;
                    continue;
                }
                if (nums[i] + nums[l] + nums[r] < 0) {
                    l++;
                    continue;
                }
                if (nums[i] + nums[l] + nums[r] > 0) {
                    r--;
                    continue;
                }
            }
        }
        return L;
    }
}