import java.util.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> ss = new HashSet<Character>();
        int i = 0, j = 0, num = 0;
        while(j != s.length()) {
            if (!ss.contains(s.charAt(j))) {
            ss.add(s.charAt(j++));
            num = Math.max(j - i, num);
            }
            else {
                ss.remove(s.charAt(i++));
            }
        }
        return num;
    }
}