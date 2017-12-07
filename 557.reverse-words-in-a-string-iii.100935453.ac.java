public class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        String out = new String();
        for (int i = 0; i < strs.length; i++) {
            StringBuffer sb = new StringBuffer();
            out += sb.append(strs[i]).reverse().toString() + " ";
        }
        return out.trim();
    }
}