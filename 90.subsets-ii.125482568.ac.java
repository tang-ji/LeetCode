class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> L = new ArrayList<List<Integer>>();
        List<Integer> l = new ArrayList<Integer>();
        helper(L, l, 0, nums);
        return L;
    }
    
    public void helper(List<List<Integer>> L, List<Integer> l, int i, int[] nums) {
        if(i <= nums.length) L.add(l);
        while(i < nums.length) {
            l.add(nums[i]);
            helper(L, new ArrayList<Integer>(l), i + 1, nums); 
            //******* new ArrayList<Integer>(l)
            l.remove(l.size() - 1);
            i++;
            while(i < nums.length && nums[i] == nums[i - 1]) i++;
        }
        return;
    }
}