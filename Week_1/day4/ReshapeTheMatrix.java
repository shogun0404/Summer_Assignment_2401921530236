class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r * c){
            return mat;
        }

       int[][] result = new int[r][c];
       int row=0;
       int col = 0;
       int i = 0 ;
       int start = 0;
       
       while(i < mat.length){
            if(col == c){
                col = 0;
                row++;
            }

            result[row][col++] = mat[i][start++];
            
            if(start == mat[0].length){
                i++;
                start=0;
            }
       }

        return result;
    }
}
