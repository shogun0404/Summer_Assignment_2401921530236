class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
    
     int row=matrix.length;
     int col=matrix[0].length;
     int rowstart=0;
     int rowend=row-1;
     int colstart=0;
     int colend=col-1;
      
     while(rowstart <= rowend  && colstart <=colend ){
        for(int j = colstart ; j <= colend ; j++){
                list.add(matrix[rowstart][j]);
        }
        rowstart++;
        
        for(int i = rowstart ; i <= rowend ; i++){
                list.add(matrix[i][colend]);        
        }
        colend--;
        

        if(rowstart <=rowend && colstart<=colend){
            for(int j = colend ; j >= colstart ; j--){
                list.add(matrix[rowend][j]);
               
            }
            rowend--;
        }
        if(rowstart <=rowend && colstart<=colend){
            for(int i = rowend ; i>= rowstart ; i--){
                list.add(matrix[i][colstart]);
            }
            colstart++;}

        }

     return list;
     }   
    }
