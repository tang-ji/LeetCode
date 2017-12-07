class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix == null) return;
        
        boolean col = false;
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == 0) col = true;
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                    continue;
                }
            }
        }
        
        for(int i = matrix.length - 1; i >= 0; i--) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[0][j] == 0 || matrix[i][0] == 0) matrix[i][j] = 0;
            }
            if(col == true) matrix[i][0] = 0;
        }
    }
}