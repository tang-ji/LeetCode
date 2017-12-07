public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                if (j == s.length() - 1) return true;
                j += 1;
            }
        }
        return false;
    }
}