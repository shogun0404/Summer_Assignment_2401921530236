class Solution {
    public int diagonalSum(int[][] mat) {
        int left = 0;
        int right = mat.length-1;
        int top = 0;
        int bottom = mat.length-1;
        int sum = 0;
        while(top <= bottom){
            if(left == right){
                sum += mat[top][left];
            }else{
                sum += mat[top][left] + mat[top][right];
            }
            
            left++;
            right--;
            top++;
        }
        return sum;
    }
}
