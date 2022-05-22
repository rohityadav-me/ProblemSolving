class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
        Sort2DArrayOnColumnNumber(intervals, 0);
        List<int[]> output = new ArrayList<>();
        int current[] = intervals[0];
        output.add(current);
        for(int j=1;j<intervals.length;j++){
            if(current[1]>=intervals[j][0]){
                current[1] = Math.max(current[1],intervals[j][1]);
            }else{
                current = intervals[j];
                output.add(current);
            }
        }
        return output.toArray(new int[output.size()][]);
    }
    
    public static void Sort2DArrayOnColumnNumber(int[][] array, int columnNumber){
        Arrays.sort(array, new Comparator<int[]>(){
            @Override
            public int compare(int[] first, int[] second){
                if(first[columnNumber]>second[columnNumber]) return 1;
                else if (first[columnNumber]<second[columnNumber]) return -1;
                else return 0;
            }
        });
    }
}