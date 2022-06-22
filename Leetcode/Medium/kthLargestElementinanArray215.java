// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         Arrays.sort(nums);
//         int j = nums.length - k;
//         return nums[j];        
//     }
// }
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        //above line create max heap 
        //We can also use quick select algo based on quick sort partition
        for(int i=0;i<nums.length;i++)
            pq.add(nums[i]);
        int ans = 0;
        while(k>0){
            ans = pq.poll();
            k--;
        }
        return ans;
        //Time complexity of this approach is O(n) + O(Klogn)
    }
}