public class Solution {
    public String longestPalindrome(String s) {
        int l = 0, r = 0;
        int[] lr;
        for (int i = 0; i < s.length() - 1; i++) {
            lr = find(s, i, i);
            if (lr[2] > r - l) {
                l = lr[0];
                r = lr[1];
            }
            if (s.charAt(i) == s.charAt(i + 1)) {
                lr = find(s, i, i + 1);
                if (lr[2] > r - l) {
                    l = lr[0];
                    r = lr[1];
                }
            }
        }
        return s.substring(l, r + 1);
    }
    
    public int[] find(String s, int m, int n) {
        int[] out = new int[3];
        out[0] = m;
        out[1] = n;
        while (out[0] > 0 && out[1] < s.length() - 1 && s.charAt(out[0] - 1) == s.charAt(out[1] + 1)) {
            out[0] -= 1;
            out[1] += 1;
        }
        out[2] = out[1] - out[0];
        return out;
    }
}