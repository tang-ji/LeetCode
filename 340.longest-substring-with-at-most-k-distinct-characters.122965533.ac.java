class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] l = new int[256];
        int n = 0, j = 0, lenmax = 0;
        for(int i = 0; i < s.length(); i++) {
            if(l[s.charAt(i)]++ == 0) n++;
            if(n > k) {
                while(--l[s.charAt(j++)] > 0);
                n--;
            }
            lenmax = Math.max(lenmax, i - j + 1);
        }
        return lenmax;
    }
}