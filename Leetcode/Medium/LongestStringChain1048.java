class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, new Comparator<String>(){
            @Override
            public int compare(final String s1,final String s2){
                if(s1.length()<s2.length()) return -1;
                else if(s1.length()>s2.length()) return 1;
                else return 0;
            }
        });
        int max = 1;
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put(words[0],1);
        for(int i=1;i<words.length;i++){
            myMap.put(words[i],1);
            for(int j=0;j<words[i].length();j++){
                StringBuilder temp = new StringBuilder(words[i]);
                temp.deleteCharAt(j);
                String pre = temp.toString();
                if(myMap.containsKey(pre)){
                    myMap.replace(words[i],Math.max(myMap.get(pre)+1,myMap.get(words[i])));
                    max = Math.max(max,myMap.get(words[i]));
                }
            }
        }
        return max;
    }
}