class Solution {
    public int minDistance(String word1, String word2) {
        int table[][] = new int[word1.length()+1][word2.length()+1];
        for(int i=1;i<=word1.length();i++){
            for(int j=1;j<=word2.length();j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    table[i][j] = table[i-1][j-1] + 1;
                }else{
                    table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
                }
            }
        }
        int max = table[word1.length()][word2.length()];
        return word1.length()-max + word2.length()-max;
    }
}