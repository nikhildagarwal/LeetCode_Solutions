class Solution {
    public int heightChecker(int[] heights) {
        int len = heights.length;
        int[] expected= new int[len];
        for(int i = 0;i<len;i++){
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        int diff = 0;
        for(int i = 0;i<len;i++){
            if(heights[i] != expected[i]){
                diff++;
            }
        }
        return diff;
    }
}