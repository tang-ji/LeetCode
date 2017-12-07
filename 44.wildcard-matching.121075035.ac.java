class Solution {
    public boolean isMatch(String s, String p) {
        int Id_s = 0, Id_p = 0, Id_star = -1, checked = 0;
        while(Id_s < s.length()) {
            if(Id_p < p.length() && (s.charAt(Id_s) == p.charAt(Id_p) || p.charAt(Id_p) == '?')) {
                Id_p++;
                Id_s++;
            }
            else if(Id_p < p.length() && p.charAt(Id_p) == '*') {
                Id_star = Id_p;
                checked = Id_s;
                Id_p++;
            }
            else if(Id_star != -1) {
                Id_p = Id_star + 1;
                checked++;
                Id_s = checked;
            }
            else return false;
        }
        
        while(Id_p < p.length()) {
            if(p.charAt(Id_p) != '*') return false;
            Id_p++;
        }
        return true;
    }
}