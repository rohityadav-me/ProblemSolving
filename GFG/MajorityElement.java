// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(Solution.majorityElement(arr, n)); 
        }
        sc.close();
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int n = size/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:a) {
            int cnt=1;
            if(map.containsKey(i)) {
                cnt=map.get(i);
                map.replace(i,++cnt);
            }else map.put(i,cnt);
        }
        for (Map.Entry<Integer,Integer> set:map.entrySet())
            if(set.getValue()>n) return set.getKey();
        return -1;
    }
}