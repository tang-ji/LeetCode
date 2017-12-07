class Solution {
    public String convertToTitle(int n) {
        StringBuilder S = new StringBuilder();
        while(n > 0) {
            S.append((char)((n - 1) % 26 + 'A'));
            n = (n - 1) / 26;
        }
        return S.reverse().toString();
    }
}