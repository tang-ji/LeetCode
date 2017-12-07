class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> L = new ArrayList<List<Integer>>();
        ArrayList<Integer> l = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i : nums) l.add(i);
        permute2(L, new ArrayList<Integer>(), l);
        return L;
    }
    
    public void permute2(List<List<Integer>> L, List<Integer> l, List<Integer> nums) {
        if(nums.size() == 0) {
            L.add(l);
        }
        else {
            for(int i = 0; i < nums.size(); i++) {
                if(i != 0 && nums.get(i) == nums.get(i - 1)) continue;
                ArrayList<Integer> ntemp = new ArrayList<Integer>(nums);
                ntemp.remove(new Integer(nums.get(i)));
                ArrayList<Integer> ltemp = new ArrayList<Integer>(l);
                ltemp.add(nums.get(i));
                permute2(L, ltemp, ntemp);
            }
        }
    }
}