class Solution {
    public boolean checkPossibility(int[] nums) {
        if(nums.length==1 || nums.length==2)
            return true;
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                if(count>0)
                    return false;
                else{
                    count++;
                    if(i>0){
                        if(nums[i+1]>=nums[i-1])
                            nums[i] = nums[i+1];
                        else
                            nums[i+1] = nums[i];
                    }else{
                        nums[i] = nums[i+1];
                    }
                }
            }
        }
        return true;
    }
}