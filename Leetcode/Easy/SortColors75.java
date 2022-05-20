class Solution {
    public void sortColors(int[] nums) {
        int left = -1;
        int mid = 0;
        int high = nums.length;
        // int i=0;
        while(mid<high){
            int temp = 0;
            if(nums[mid]==0){
                // left++;
                temp = nums[++left];
                nums[left] = nums[mid];
                nums[mid++] = temp;
            }else if(nums[mid]==2){
                high--;
                temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
            }else
                mid++;
        }
    }
}