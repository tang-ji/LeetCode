class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> L = new ArrayList<>();
        List<Integer> l = new ArrayList<Integer>();
        for(int j : nums) l.add(j);
        for(int i = 0; i <= nums.length; i++) combine(L, new ArrayList<Integer>(), l, i);
        return L;
    }
    
    private void combine(List<List<Integer>> L, List<Integer> l, List<Integer> nums, int k) {
        if(k == 0) L.add(new ArrayList<>(l));
        else if(nums.size() == 0) return;
        else {
            for(int i = 0; i < nums.size(); i++) {
                l.add(nums.get(i));
                List<Integer> ntemp = nums.subList(i + 1, nums.size());
                combine(L, l, ntemp, k - 1);
                l.remove(l.size() - 1);
            }
        }
    }
}