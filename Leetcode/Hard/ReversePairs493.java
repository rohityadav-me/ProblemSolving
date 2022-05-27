// import java.math.BigInteger;
class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    
    public int mergeSort(int[] nums, int l, int r){
        int res = 0;
        if(l<r){
            int m = (l+r)/2;
            res += mergeSort(nums,l,m);
            res += mergeSort(nums,m+1,r);
            res += merge(nums,l,m,r);
        }
        return res;
    }
    
    public int merge(int[] nums, int l, int m, int r){
        int n1 = m-l+1, n2 = r-m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=0;i<n1;i++)
            left[i] = nums[i+l];
        for(int j=0;j<n2;j++)
            right[j] = nums[m+1+j];
        int res = 0, i=0,j=0, k=l;
        while(i<n1 && j<n2){
            if((long)left[i]>(long)2*right[j]){
                res = res + (n1-i);
                j++;
            }else{
                i++;
            }
        }
        i = 0; j = 0;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                nums[k++] = left[i++];
            else
                nums[k++] = right[j++];
        }
        while(i<n1)
            nums[k++] = left[i++];
        while(j<n2)
            nums[k++] = right[j++];
        return res;
    }
}