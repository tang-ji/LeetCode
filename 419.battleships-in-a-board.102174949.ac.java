public class Solution {
    public int countBattleships(char[][] board) {
        boolean[][] check = new boolean[board.length][board[0].length];
        int sum = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'X' && check[i][j] == false) {
                    sum++;
                    int k = i;
                    while (k < board.length && board[k][j] == 'X') {
                        check[k][j] = true;
                        k++;
                    }
                    while (j < board[0].length && board[i][j] == 'X') {
                        check[i][j] = true;
                        j++;
                    }
                }
            }
        }
        return sum;
    }
}