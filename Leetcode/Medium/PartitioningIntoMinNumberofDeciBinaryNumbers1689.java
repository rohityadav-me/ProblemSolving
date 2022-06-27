class Solution {
    public int minPartitions(String n) {
        int count = 0;
        int max = 0;
        for(int i=0;i<n.length();i++){
            int num = n.charAt(i) - '0';
            if(num>max){
                count = count + num - max;
                max = num;
                if(count==9)
                    break;
            }
        }
        return count;
    }
}