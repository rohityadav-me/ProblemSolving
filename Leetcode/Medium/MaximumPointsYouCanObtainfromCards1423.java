class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        if(k==cardPoints.length){
            for(int val : cardPoints)
                sum += val;
            return sum;
        }
        int left = k-1;
        for(int i=0;i<=left;i++){
            sum += cardPoints[i];
        }
        int right = cardPoints.length;
        int max = sum;
        while(left>=0){
            sum = sum - cardPoints[left--];
            sum = sum + cardPoints[--right];
            if(sum>max)
                max = sum;
        }
        return max;
    }
}