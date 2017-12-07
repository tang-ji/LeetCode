class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ret = new int[n][n];
        int s = 1;
        for(int i = 0; i <= n / 2; i++) {
            s = circle(ret, i, s);
        }
        return ret;
    }
    
    public int circle(int[][] M, int s, int n) {
        for(int i = s; i < M.length - s; i++) {
            M[s][i] = n;
            n++;
        }
        for(int i = s + 1; i < M.length - s; i++) {
            M[i][M.length - s - 1] = n;
            n++;
        }
        
        for(int i = M.length - s - 2; i >= s; i--) {
            M[M.length - s - 1][i] = n;
            n++;
        }
        
        for(int i = M.length - s - 2; i > s; i--) {
            M[i][s] = n;
            n++;
        }
        return n;
    }
}