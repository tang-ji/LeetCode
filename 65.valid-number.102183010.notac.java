public class Solution {
    public boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) < '0' || s.charAt > '9') && s.charAt(i) != 'e' && s.charAt(i) != '.') return false;
        }
    }
}