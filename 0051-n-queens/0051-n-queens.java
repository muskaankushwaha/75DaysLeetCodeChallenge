class Solution {
    // boolean isSafe(int row,int col,char[][]board,int n){
    //     int r=row;
    //     int c=col;
    //     //upper Diaginal
    //     while(row>=0&&col>=0){
    //         if(board[row][col]=='Q')return false;
    //         row--;
    //         col--;
    //     }
    //     row=r;
    //     col=c;
    //     //left row
    //      while(col>=0){
    //         if(board[row][col]=='Q')return false;
    //         col--;
    //     }
    //     row=r;
    //     col=c;
    //     //lower diagonal
    //      while(row<n&&col>=0){
    //         if(board[row][col]=='Q')return false;
    //         row++;
    //         col--;
    //     }
    //     return true;
    // }
    void solve(int col,char[][]board,List<List<String>> ans,int n ,int[] leftRow,int[] upperDiagonal, int[] lowerDiagonal){
        if(col==n){
            List<String> temp=new ArrayList<>();
            for(int i=0; i<n; i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for(int row=0; row<n; row++){
            if(leftRow[row]==0 && lowerDiagonal[row+col]==0 && upperDiagonal[(n-1)+(col-row)]==0){
                board[row][col]='Q';
                leftRow[row]=1;
                upperDiagonal[n-1+col-row]=1;
                lowerDiagonal[row+col]=1;
                solve(col+1,board,ans,n,leftRow,upperDiagonal,lowerDiagonal);
                board[row][col]='.';
                 leftRow[row]=0;
                upperDiagonal[n-1+col-row]=0;
                lowerDiagonal[row+col]=0;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(board[i],'.');
        }
        int [] leftRow=new int[n];
        int[] upperDiagonal=new int[2*n-1];
         int[] lowerDiagonal=new int[2*n-1];
        solve(0,board,ans,n,leftRow,upperDiagonal,lowerDiagonal);
        return ans;
    }
}