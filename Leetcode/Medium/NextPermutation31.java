class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<=1)    return;
        int i = nums.length -2;
        while(i >= 0 && nums[i] >= nums[i + 1]) i--; 
        if(i >= 0) {                           
            int j = nums.length - 1;              
            while(nums[j] <= nums[i]) j--;      
            swap(nums, i, j);                     
        }
        reverse(nums, i + 1, nums.length - 1);      
    }
    
    public static void swap(int[] arr, int i, int k){
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
    public static void reverse(int[] nums,int low,int high){
        while(low<high) swap(nums, low++, high--);
    }
}