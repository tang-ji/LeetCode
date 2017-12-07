class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        List<Integer> l = new ArrayList<Integer>();
        rest(ret, l, candidates, target, 0);
        return ret;
    }
    
    public void rest(List<List<Integer>> ret, List<Integer> l, int[] candidates, int target, int start) {
        if(target > 0) {
            for(int i = start; i < candidates.length; i++) {
                l.add(candidates[i]);
                rest(ret, l, candidates, target - candidates[i], i);
                l.remove(l.size() - 1);
            }
        }
        else if(target == 0) ret.add(new ArrayList(l)); // Too important to construct a new ArrayList!!!!
    }
}