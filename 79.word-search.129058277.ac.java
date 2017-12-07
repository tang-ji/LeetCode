class Solution {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || board[0].length == 0)  return false;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(exist(board, word, 0, i, j)) return true;
            }
        }
        return false;
    }
    
    protected boolean exist(char[][] board, String word, int start, int i, int j) {
        if(start == word.length()) return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
        if(board[i][j] == word.charAt(start++)) {
            char temp = board[i][j];
            board[i][j] = '.';
            boolean res = exist(board, word, start, i - 1, j) || exist(board, word, start, i + 1, j) || exist(board, word, start, i, j - 1) || exist(board, word, start, i, j + 1);
            board[i][j] = temp;
            return res;
        }
        return false;
    }
}