public class Solution {
    public char findTheDifference(String s, String t) {
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            l ^= (int)s.charAt(i);
        }
        for (int j = 0; j < t.length(); j++) {
            l ^= (int)t.charAt(j);
        }
        return (char)l;
    }
}