class Solution {
    public boolean checkValid(int[][] matrix) {

    return row(matrix)&&col(matrix);
    }
    public boolean row(int [][]matrix){
        for(int i=0; i<matrix.length; i++){
            Set <Integer> s=new HashSet<>();
            for(int j=0; j<matrix.length; j++){
                s.add(matrix[i][j]);
            }
            if(s.size()!=matrix.length)return false;
        }
    return true;
    }
     public boolean col(int [][]matrix){
        for(int i=0; i<matrix.length; i++){
            Set <Integer> s=new HashSet<>();
            for(int j=0; j<matrix.length; j++){
                s.add(matrix[j][i]);
            }
            if(s.size()!=matrix.length)return false;
        }
    return true;
    }
}