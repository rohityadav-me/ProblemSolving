class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        int count = 0;
        int first_occurence = 0;
        int second_occurence = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(count>1)
                    second_occurence = i;
                else
                    first_occurence = i;
                if(count > 2)   return false;
            }
        }
        if(s1.charAt(first_occurence)==s2.charAt(second_occurence) && s1.charAt(second_occurence)==s2.charAt(first_occurence))
            return true;
        return false;
    }
}