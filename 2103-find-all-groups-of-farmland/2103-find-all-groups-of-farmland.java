class Solution {
    List<int[]> farms;

    public void tranverse(int i, int j, List<int[]> farms, int bR, int bD, int[][] land){
        int tempI = i;
        int tempJ = j;
        while(tempI<=bD && land[tempI][j]==1){
            tempI++;
        }
        while(tempJ<=bR && land[i][tempJ]==1){
            tempJ++;
        }
        tempI--;
        tempJ--;
        int[] newFarm = {i,j,tempI,tempJ};
        farms.add(newFarm);
        for(int k = i;k<=tempI;k++){
            for(int l =j;l<=tempJ;l++){
                land[k][l]=0;
            }
        }
    }

    public int[][] findFarmland(int[][] land) {
        farms = new ArrayList<>();
        int bR = land[0].length-1;
        int bD = land.length-1;
        for(int i = 0;i<=bD;i++){
            for(int j = 0;j<=bR;j++){
                if(land[i][j]==1){
                    tranverse(i,j,farms,bR,bD,land);
                }
            }
        }
        return farms.toArray(new int[farms.size()][]);
    }
}