import java.lang.String;
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int n = 0;
        for(int j = s.length() - 1; j >= 0; j--) {
            if(s.charAt(j) != ' ') n++;
            else break;
        }
        return n;
    }
}