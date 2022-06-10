class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> mySet = new HashSet<>();
        int max = 0;
        int i=0,j=0;
        while(j<s.length()){
            if(mySet.contains(s.charAt(j))){
               while(mySet.contains(s.charAt(j))==true){
                   mySet.remove(s.charAt(i));
                   i++;
               }
            }else{
                if(j-i+1>max)
                    max = j-i+1;
                mySet.add(s.charAt(j));
                j++;
            }
        }
        return max;
    }
}