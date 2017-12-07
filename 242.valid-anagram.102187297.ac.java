import java.util.*;

public class Solution {
    public boolean isAnagram(String s, String t) {
        int l = s.length();
        if (l != t.length()) return false;
        Map<Character, Integer> hmap = new HashMap<Character, Integer>();
        for (int i = 0; i < l; i++) {
            hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0) + 1);
            hmap.put(t.charAt(i), hmap.getOrDefault(t.charAt(i), 0) - 1);
        }
        int sum = 0;
        for (int j : hmap.values()) {sum += Math.abs(j);}
        if (sum != 0) return false;
        return true;
    }
}