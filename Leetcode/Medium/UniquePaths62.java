class Solution {
    // int[][] table_memory = new int[m][n];
    public int uniquePaths(int m, int n) {
        int[][] table_memory = new int[m][n];
        for(int i=0;i<n;i++)
            table_memory[0][i] = 1;
        for(int i=0;i<m;i++)
            table_memory[i][0] = 1;
        for(int i=1;i<m;i++)
            for(int j=1;j<n;j++)
                table_memory[i][j] = table_memory[i-1][j] + table_memory[i][j-1];
        return table_memory[m-1][n-1];
    }
}