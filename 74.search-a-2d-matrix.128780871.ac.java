class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        if(matrix[0][0] > target || matrix[matrix.length - 1][matrix[0].length - 1] < target) return false;
        return search(matrix, target, 0, matrix.length * matrix[0].length);
    }
    
    private boolean search(int[][] matrix, int target, int i, int j) {
        if(i > j) return false;
        int mid = i + ((j - i) >> 1);
        if(get(matrix, mid) == target) return true;
        if(get(matrix, mid) < target) return search(matrix, target, mid + 1, j);
        return search(matrix, target, i, mid - 1);
    }
    
    private int get(int[][] matrix, int n) {
        int l = n / matrix[0].length;
        int c = n % matrix[0].length;
        return matrix[l][c];
    }
}