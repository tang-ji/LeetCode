class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    
    public boolean solve(char[][] board) {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.') {
                    for(int n = 1; n <= 9; n++) {
                        if(isValid(board, i, j, (char)('0' + n))) {
                            board[i][j] = (char)('0' + n);
                            if(solve(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isValid(char[][] board, int l, int c, char temp) {
        for(int j = 0; j < 9; j++) if(j != c && temp == board[l][j]) return false;
        for(int i = 0; i < 9; i++) if(i != l && temp == board[i][c]) return false;
        for(int j = (c/3) * 3; j < (c/3 + 1) * 3; j++) {
            if(j == c) continue;
            for(int i = (l/3) * 3; i < (l/3 + 1) * 3; i++) {
                if(i == l) continue;
                if(temp == board[i][j]) return false;
            }
        }
        return true;
    }
}