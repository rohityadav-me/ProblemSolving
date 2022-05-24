class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = 0;
        int cols = 0;
        while(rows<matrix.length){
            if(cols<matrix[0].length && matrix[rows][cols]==target)
                return true;
            else if(cols<matrix[0].length && matrix[rows][cols]<target)
                cols++;
            else if(cols==matrix[0].length || matrix[rows][cols]>target){
                rows++;
                cols = 0;
            }
        }
        return false;
    }
}