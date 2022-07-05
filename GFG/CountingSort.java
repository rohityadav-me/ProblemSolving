// { Driver Code Starts
    import java.util.*;
    import java.lang.*;
    
    class CountSort
    {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                long n = sc.nextLong();
                String arr = "";
                arr = sc.next();
                Solution obj = new Solution();
                System.out.println(obj.countSort(arr));
            }
        }
    }
    
    class Solution
    {
        //Function to arrange all letters of a string in lexicographical 
        //order using Counting Sort.
        public static String countSort(String arr)
        {
            // code here
            char[] ori = arr.toCharArray();
            char max = 'a';
            for(int i=0;i<ori.length;i++){
                if(ori[i]>max)
                    max = ori[i];
            }
            char[] count = new char[max-'a'+1];
            for(int i=0;i<ori.length;i++)
                count[ori[i]-'a']++;
            char place = 'a';
            for(int i=0,j=0;i<count.length;i++){
                while(count[i]!=0){
                    ori[j++] = place;
                    count[i]--;
                }
                place++;
            }
            String ans = new String(ori);
            return ans;
        }
    }