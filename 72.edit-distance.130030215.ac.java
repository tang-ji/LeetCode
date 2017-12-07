class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        return editDistance(n, m, word1, word2, new int[n + 1][m + 1]);
    }
    
    protected int editDistance(int i, int j, String A, String B, int[][] dp) {
        if(i == 0) return j;
        if(j == 0) return i;
        if(dp[i][j] != 0) return dp[i][j];
        if(A.charAt(i - 1) == B.charAt(j - 1)) return dp[i][j] = editDistance(i - 1, j - 1, A, B, dp);
        int Ci = editDistance(i - 1, j, A, B, dp);
        int Cj = editDistance(i, j - 1, A, B, dp);
        int Cr = editDistance(i - 1, j - 1, A, B, dp);
        dp[i][j] = Math.min(Ci, Math.min(Cj, Cr)) + 1;
        return dp[i][j];
    }
}