class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> revValue = new ArrayList<>();
        List<Integer> prev = new ArrayList<>(Arrays.asList(1));
        for(int i = 1;i<=numRows;i++){
            List<Integer> curr = new ArrayList<>();
            for(int j=0;j<i;j++){ 
                if(j==0 || j== (i-1)){
                    curr.add(1);
                }else{
                    int val = prev.get(j) + prev.get(j-1);
                    curr.add(val);
                }
            }
            revValue.add(curr);
            prev = curr;
        }
        return revValue;
    }
}