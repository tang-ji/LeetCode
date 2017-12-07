class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        List<Integer> l = new ArrayList<Integer>();
        rest(ret, l, candidates, target, 0);
        return ret;
    }
    
    public void rest(List<List<Integer>> ret, List<Integer> l, int[] candidates, int target, int start) {
        if(target > 0) {
            for(int i = start; i < candidates.length; i++) {
                if(i > start && candidates[i] == candidates[i - 1]) continue;
                l.add(candidates[i]);
                rest(ret, l, candidates, target - candidates[i], i + 1);
                l.remove(l.size() - 1);
            }
        }
        else if(target == 0) ret.add(new ArrayList(l)); // Too important to construct a new ArrayList!!!!
    }
}