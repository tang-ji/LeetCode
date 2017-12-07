public class Solution {
    public int count(String s, char c) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) n += 1;
        }
        return n;
    }
    
    public boolean checkL(String s) {
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("LLL")) return false;
        }
        return true;
    }
    public boolean checkRecord(String s) {
        if (count(s, 'A') <= 1 && checkL(s)) return true;
        else return false;
    }
}