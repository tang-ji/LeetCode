class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int l = 0; l < 9; l++) {
            for(int c = 0; c < 9; c++) {
                if(board[c][l] == '.') continue;
                char temp = board[c][l];
                if(l != 8) for(int j = l + 1; j < 9; j++) if(temp == board[c][j]) return false;
                if(c != 8) for(int i = c + 1; i < 9; i++) if(temp == board[i][l]) return false;
                for(int j = (l/3) * 3; j < (l/3 + 1) * 3; j++) {
                    if(j == l) continue;
                    for(int i = (c/3) * 3; i < (c/3 + 1) * 3; i++) {
                        if(i == c) continue;
                        if(temp == board[i][j]) return false;
                    }
                }
            }
        }
        return true;
    }
}