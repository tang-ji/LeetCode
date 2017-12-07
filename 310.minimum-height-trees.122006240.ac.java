class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return Collections.singletonList(0);
        
        List<Integer> ret = new ArrayList<Integer>();
        Map<Integer, List<Integer>> L = new HashMap<>();
        for(int i = 0; i < edges.length; i++) {
            if(!L.containsKey(edges[i][0])) L.put(edges[i][0], new ArrayList<Integer>());
            L.get(edges[i][0]).add(edges[i][1]);
            if(!L.containsKey(edges[i][1])) L.put(edges[i][1], new ArrayList<Integer>());
            L.get(edges[i][1]).add(edges[i][0]);
        }
        
        for(int i : L.keySet()) {
            if(L.get(i).size() == 1) ret.add(i);
        }
        
        while(n > 2) {
            n -= ret.size();
            List<Integer> ret2 = new ArrayList<Integer>();
            for(int i : ret) {
                int j = L.get(i).iterator().next();
                L.get(j).remove(new Integer(i));
                if(L.get(j).size() == 1) ret2.add(j);
            }
            ret = ret2;
        }
        return ret;
    }
}