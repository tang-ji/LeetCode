public class Solution {
    public int myAtoi(String str) {
        int r = 0;
        boolean Neg = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= '9' && str.charAt(i) >= '0') r = r * 10 + (int)(str.charAt(i) - '0');
            if (str.charAt(i) == '-') Neg = true;
        }
        if (Neg) return -r;
        return r;
    }
}