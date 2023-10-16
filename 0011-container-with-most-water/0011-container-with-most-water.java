class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int pL = 0;
        int pR = height.length-1;
        while(pL!=pR){
            maxArea = Math.max(maxArea,Math.min(height[pL],height[pR])*(pR-pL));
            if(height[pL]<height[pR]){
                pL++;
            }else{
                pR--;
            }
        }
        return maxArea;
    }
}