class Solution {
    public int strStr(String haystack, String needle) {
        int N = haystack.length();
        int n = needle.length();
        if(n > N) return -1;
        for(int i = 0; i <= N - n; i++) {
            if(needle.equals(haystack.substring(i, i + n))) return i;
        }
        return -1;
    }
}