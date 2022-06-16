// class Solution { //mycode
//     // Set<String> mySet;
//     public int countSubstrings(String s) {
//         // mySet = new HashSet<>();
//         if(s.length() == 1) return 1;
//         int count = 0;
//         for(int i=0;i<s.length();i++){
//             int len1 = expand(s,i,i);
//             int len2 = expand(s,i,i+1);
//             count = count + len1 + len2;
//         }
//         return count;
//     }
    
//     public int expand(String s, int left, int right){
//         int count = 0;
//         while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
//             left--;
//             right++;
//             count++;
//         }
//         return count;
//     }
// }

//someone's else code
class Solution {
    public int countSubstrings(String S) {
        int len = S.length(), ans = 0;
        for (int i = 0; i < len; i++) {
            int j = i - 1, k = i;
            while (k < len - 1 && S.charAt(k) == S.charAt(k+1)) k++;
            ans += (k - j) * (k - j + 1) / 2;
            i = k++;
            while (j >= 0 && k < len && S.charAt(k++) == S.charAt(j--)) ans++;
        }
        return ans;
    }
}