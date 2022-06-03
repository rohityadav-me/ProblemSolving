public class NumMatrix {
    private final int[][] prefix;
  
    public NumMatrix(int[][] matrix) {
      int m = matrix.length;
      if (m == 0) {
        prefix = new int[0][0];
        return;
      }
  
      int n = matrix[0].length;
  
      prefix = new int[m + 1][n + 1];
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          prefix[i + 1][j + 1] = matrix[i][j] + prefix[i][j + 1] - prefix[i][j] + prefix[i + 1][j];
        }
      }
    }
  
    public int sumRegion(int row1, int col1, int row2, int col2) {
      row2++;
      col2++;
      return prefix[row2][col2] - prefix[row2][col1] - prefix[row1][col2] + prefix[row1][col1];
    }
  }
  
  /**
   * Your NumMatrix object will be instantiated and called as such:
   * NumMatrix obj = new NumMatrix(matrix);
   * int param_1 = obj.sumRegion(row1,col1,row2,col2);
   */