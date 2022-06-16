// class Solution {
//     public String longestPalindrome(String s) {
//         if(s.length()<2)
//             return s;
//         int window = s.length()-1;
//         while(true){
//             for(int i=0;i+window<s.length();i++){
//                 String sub = s.substring(i,i+window+1);
//                 if(isPalindrome(sub))
//                     return sub;
//             }
//             window--;
//         }
//     }
//     public boolean isPalindrome(String s){
//         for(int i=0,j=s.length()-1;i<j;i++,j--){
//             if(s.charAt(i)!=s.charAt(j))
//                 return false;
//         }
//         return true;
//     }
// }    //O(n^3) solution


//O(n^2) solution
class Solution{
    public String longestPalindrome(String s){
        if(s==null || s.length()<1) return "";
        int maxLen = 0;
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++){
            int len1 = move(s,i,i);
            int len2 = move(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len>maxLen){
                maxLen = len;
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);
    }
    
    public int move(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
