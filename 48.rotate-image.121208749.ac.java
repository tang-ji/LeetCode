class Solution {
    public void rotate(int[][] matrix) {
        int dim = matrix.length - 1;
        for(int i = 0; i < dim / 2 + 1; i++) {
            for(int j = i; j < dim - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[dim - j][i];
                matrix[dim - j][i] = matrix[dim - i][dim - j];
                matrix[dim - i][dim - j] = matrix[j][dim - i];
                matrix[j][dim - i] = temp;
            }
        }
    }
}