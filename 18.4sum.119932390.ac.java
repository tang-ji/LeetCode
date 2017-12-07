class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if(nums.length < 4) return ret;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++) {
            if(i != 0 && nums[i] == nums[i-1]) continue;
            for(int j = nums.length - 1; j > i + 2; j--) {
                if(j != nums.length - 1 && nums[j] == nums[j+1]) continue;
                int l = i + 1, r = j - 1;
                while(r > l) {
                    if(l != i + 1 && nums[l] == nums[l-1]) {
                        l++;
                        continue;
                    }
                    if(r != j - 1 && nums[r] == nums[r+1]) {
                        r--;
                        continue;
                    }
                    if(nums[i] + nums[j] + nums[l] + nums[r] == target) {
                        ret.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[l], nums[r], nums[j])));
                        l++;
                        r--;
                    }
                    else if(nums[i] + nums[j] + nums[l] + nums[r] < target) l++;
                    else if(nums[i] + nums[j] + nums[l] + nums[r] > target) r--;
                }
            }
        }
        return ret;
    }
}