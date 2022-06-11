class Solution {
    public int minOperations(int[] nums, int x) {
        Map<Integer,Integer> prefix = new HashMap<>();
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            prefix.put(sum,i);
        }
        if(sum<x)
            return -1;
        int min = Integer.MAX_VALUE;
        sum = 0;
        if(prefix.containsKey(x))
            min = prefix.get(x)+1;
        for(int j=nums.length-1;j>=0;j--){
            sum += nums[j];
            if(x-sum==0){
                if(min>(nums.length-j)){
                    min = nums.length-j;
                    // break;
                }
            }
            else if(prefix.containsKey(x-sum)){
                if(min>(nums.length-j + prefix.get(x-sum)+1)){
                    min = nums.length-j + prefix.get(x-sum)+1;
                    // break;
                }
            }
        }
        if(min==Integer.MAX_VALUE)
            return -1;
        return min;
    }
}