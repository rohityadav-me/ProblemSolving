class Solution {
    public int minimumLengthEncoding(String[] words) {
        Set<String> s1 = new HashSet<>(Arrays.asList(words));
        Set<String> s2 = new HashSet<>(Arrays.asList(words));
        for(String word : words){
            for(int i=1;i<word.length();i++){
                String s= word.substring(i);
                if(s2.contains(s)){
                    s2.remove(s);
                    break;
                }
            }
        }
        int count = 0;
        for(String word: s2){
            count += word.length();
            count++;
        }
        return count;
    }
}