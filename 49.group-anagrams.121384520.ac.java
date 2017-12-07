class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<List<String>>();
        Map<String, List<String>> L = new HashMap<>();
        for(String s : strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String s2 = new String(temp);
            if(!L.containsKey(s2)) L.put(s2, new ArrayList<String>());
            L.get(s2).add(s);
        }
        return new ArrayList<List<String>>(L.values());
    }
}