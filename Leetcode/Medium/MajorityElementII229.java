class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int e1 = -1;
        int e2 = -1;
        int c1 = 0;
        int c2 = 0;
        
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            
            if(nums[i] == e1){
                c1++;
            }
            else if(nums[i] == e2){
                c2++;
            }
            else if(c1 == 0){
                e1 = nums[i];
                c1 = 1;
            }
            else if(c2 == 0){
                e2 = nums[i];
                c2 = 1;
            }
            else{
                c1--;
                c2--;
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        c1=0;
        c2=0;
        for(int i=0; i<n; i++){
            if(nums[i] == e1){
                c1++;
            }
            else if(nums[i] == e2){
                c2++;
            }
        }
        
        if(c1 > n/3){
            ans.add(e1);
        }
        if(c2 > n/3){
            ans.add(e2);
        }
        return ans;
    }
}