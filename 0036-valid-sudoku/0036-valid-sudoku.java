class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char ch = board[i][j];
                if(ch == '.') continue;

                if(!(box(board, ch, i, j) && row(board, ch, i) && col(board, ch, j)))
                    return false;
            }
        }
        return true;
    }

    public boolean box(char[][] board, char ch, int row, int col){
        int count = 0;

        // FIX: correct starting index of 3x3 box
        int r = (row / 3) * 3;
        int c = (col / 3) * 3;

        for(int i = r; i < r + 3; i++){
            for(int j = c; j < c + 3; j++){
                if(board[i][j] == ch) count++;
            }
        }

        return count <= 1;
    }

    public boolean row(char[][] board, char ch, int row){
        int count = 0;
        for(int i=0; i<9; i++){
            if(board[row][i] == ch) count++;
        }
        return count <= 1;
    }

    public boolean col(char[][] board, char ch, int col){
        int count = 0;
        for(int i=0; i<9; i++){
            if(board[i][col] == ch) count++;
        }
        return count <= 1;
    }
}