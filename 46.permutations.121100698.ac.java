class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> L = new ArrayList<List<Integer>>();
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i : nums) l.add(i);
        permute2(L, new ArrayList<Integer>(), l);
        return L;
    }
    
    public void permute2(List<List<Integer>> L, List<Integer> l, List<Integer> nums) {
        if(nums.size() == 0) L.add(l);
        else {
            for(int i : nums) {
                ArrayList<Integer> ntemp = new ArrayList<Integer>(nums);
                ntemp.remove(new Integer(i));
                ArrayList<Integer> ltemp = new ArrayList<Integer>(l);
                ltemp.add(i);
                permute2(L, ltemp, ntemp);
            }
        }
    }
}