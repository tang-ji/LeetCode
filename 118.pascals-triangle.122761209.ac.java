class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> L =  new ArrayList<>();
        for(int i = 1; i <= numRows; i++) {
            List<Integer> l = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();
            if(i != 1) temp = L.get(L.size() - 1);
            for(int j = 1; j <= i; j++) {
                if(j == 1 || j == i) {
                    l.add(1);
                    continue;
                }
                l.add(temp.get(j - 2) + temp.get(j - 1));
            }
            L.add(l);
        }
        return L;
    }
}