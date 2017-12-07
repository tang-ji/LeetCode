class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder S = new StringBuilder();
        for(char c : s.toLowerCase().toCharArray()) if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') ) S.append(c);
        for(int i = 0; i < S.length() / 2; i++) {
            if(S.charAt(i) != S.charAt(S.length() - 1 - i)) return false;
        }
        return true;
    }
}