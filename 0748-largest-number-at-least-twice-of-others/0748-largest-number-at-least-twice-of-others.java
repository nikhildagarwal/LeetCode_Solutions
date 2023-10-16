class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int[][] newNums = new int[n][2];
        for(int i = 0;i<n;i++){
            newNums[i][0] = nums[i];
            newNums[i][1] = i;
        }
        Arrays.sort(newNums, (a,b) -> Integer.compare(a[0],b[0]));
        if(newNums[n-1][0] >= newNums[n-2][0]*2){
            return newNums[n-1][1];
        }
        return -1;
    }
}