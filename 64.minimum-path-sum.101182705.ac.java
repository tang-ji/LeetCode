public class Solution {
    public int minPathSum(int[][] grid) {
        int c = grid[0].length, l = grid.length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (i != 0 && j == 0) grid[i][j] += grid[i - 1][j];
                if (i == 0 && j != 0) grid[i][j] += grid[i][j - 1];
                if (i != 0 && j != 0) grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[l - 1][c - 1];
    }
}