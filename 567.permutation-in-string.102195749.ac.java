public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            if (permutation(s1, s2.substring(i, i + s1.length()))) return true;
        }
        return false;
    }
    
    public boolean permutation(String s1, String s2) {
        char[] c = new char[26];
        for (int i = 0; i < s1.length(); i++) {
            c[s1.charAt(i) - 'a']++;
            c[s2.charAt(i) - 'a']--;
        }
        int sum = 0;
        for (int j : c) sum += Math.abs(j);
        if (sum == 0) return true;
        return false;
    }
}