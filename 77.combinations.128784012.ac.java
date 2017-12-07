class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> L = new ArrayList<>();
        combine(L, new ArrayList<Integer>(), 1, n, k);
        return L;
    }
    
    private void combine(List<List<Integer>> L, List<Integer> l, int start, int end, int k) {
        if(k == 0) L.add(new ArrayList<>(l));
        else if(start > end) return;
        else {
            for(int i = start; i <= end; i++) {
                l.add(i);
                combine(L, l, i + 1, end, k - 1);
                l.remove(l.size() - 1);
            }
        }
    }
}