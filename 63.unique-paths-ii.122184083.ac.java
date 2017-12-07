class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid[0].length;
        int[] step = new int[n];
        step[0] = 1;
        
        for(int[] row : obstacleGrid) {
            for(int i = 0; i < n; i++) {
                if(row[i] == 1) step[i] = 0;
                else if(i > 0) step[i] += step[i - 1];
            }
        }
        return step[n - 1];
    }
}