class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //sorting boxTypes in descending order based on numberOfUnitsPerBox
        Arrays.sort(boxTypes, new Comparator<int[]>(){
            @Override
            public int compare(final int[] row1, final int[] row2){
                if(row1[1]>row2[1])
                    return -1;
                else if(row1[1]<row2[1])
                    return 1;
                else //(row1[1]==row2[1])
                    return 0;
            }
        });
        
        // for(int i=0;i<boxTypes.length;i++){
        //     for(int j=0;j<2;j++)
        //         System.out.print(boxTypes[i][j]+" ");
        // }
        int max = 0;
        for(int i=0;i<boxTypes.length && truckSize>0;i++){
            if(boxTypes[i][0]<=truckSize){
                max = max + (boxTypes[i][0] * boxTypes[i][1]);
                truckSize -= boxTypes[i][0];
            }else{
                max = max + (truckSize * boxTypes[i][1]);
                truckSize = 0;
            }
        }
        return max;
    }
}