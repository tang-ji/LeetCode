class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] index = new int[matrix.length];
        int i1 = 0, i2 = 0, n = 0, min = 0;
        while(n < k) {
            min = Integer.MAX_VALUE;
            for(int j = 0; j < matrix.length; j++) {
                if(index[j] == matrix[0].length) continue;
                if(matrix[j][index[j]] <= min) {
                    min = matrix[j][index[j]];
                    i1 = j;
                    i2 = index[j];
                }
            }
            index[i1] += 1;
            n++;
        }
        return min;
    }
}