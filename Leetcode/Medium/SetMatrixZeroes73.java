class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = true;
        boolean firstCol = true;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    if(i==0 && j==0){
                        firstCol = false;
                        firstRow = false;
                    }else if(i==0)
                        firstRow = false;
                    else if(j==0)
                        firstCol = false;
                    else{
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                    }
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0]==0){
                for(int j=0;j<matrix[i].length;j++)
                    matrix[i][j] = 0;
            }
        }
        for(int i=1;i<matrix[0].length;i++){
            if(matrix[0][i]==0){
                for(int j=0;j<matrix.length;j++)
                    matrix[j][i] = 0;
            }
        }
        if(firstRow==false){
            int i=0;
            for(int j=0;j<matrix[i].length;j++)
                matrix[i][j] = 0;
        }
        if(firstCol == false){
            int i =0;
            for(int j=0;j<matrix.length;j++)
                matrix[j][i] = 0;
        }
    }
}