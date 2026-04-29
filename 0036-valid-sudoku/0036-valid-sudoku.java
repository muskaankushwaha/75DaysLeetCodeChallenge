class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char ch=board[i][j];
                if(ch=='.')continue;
                if(!(box(board,ch,i,j)&&row(board,ch,i)&&col(board,ch,j)))return false;
            
            }

        }
        return true;
        
    }
     public boolean box(char[][]board,char ch,int row, int col){
        int count=0;
        row=row/3;
        col=col/3;
        int r=0;
        int c=0;
        if(row==1)r=3;
        else if(row==2)r=6;
        if(col==1)c=3;
        else if(col==2)c=6;
        for(int i=r; i<r+3; i++){
            for(int j=c; j<c+3; j++){
                if(board[i][j]==ch)count++;
                }
        }
                if(count>1)return false;
                return true;      
                  
        }
       
    
    public boolean row(char[][]board,char ch,int row){
        int count=0;
        for(int i=0; i<9; i++){
            if(board[row][i]==ch)count++;
                }
                if(count>1)return false;
                return true;      
                  }
     public boolean col(char[][]board,char ch,int col){
        int count=0;
        for(int i=0; i<9; i++){
            if(board[i][col]==ch)count++;
                }
                if(count>1)return false;
                return true;    
                    }
}