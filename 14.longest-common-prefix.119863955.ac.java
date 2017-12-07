class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer s = new StringBuffer();
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        int n = strs[0].length();
        for(int i = 0; i < strs.length; i++) n = Math.min(n, strs[i].length());
        for(int j = 0; j < n; j++) {
            for(int i = 0; i < strs.length; i++) {
                if (strs[i].charAt(j) != strs[0].charAt(j)) return s.toString();
            }
            s.append(strs[0].charAt(j));
        }
        return s.toString();
    }
}