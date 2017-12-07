public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        String r = "";
        for (int i = 0; i < numRows; i++) {   
            for (int j = 0; j < s.length(); j++) { 
                if ((j - i) % (2 * numRows - 2) == 0 || (j + i) % (2 * numRows - 2) == 0) r += s.charAt(j);
            }
        }
        return r;
    }
}