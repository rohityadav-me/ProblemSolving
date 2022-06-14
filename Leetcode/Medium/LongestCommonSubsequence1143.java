class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int table[][] = new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<=text1.length();i++){
            for(int j = 1;j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    table[i][j] = table[i-1][j-1]+1;
                }else{
                    table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
                }
            }
        }
        return table[text1.length()][text2.length()];
    }
}