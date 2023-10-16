class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));
        int currEnd = points[0][1];
        int arrows = 1;
        for(int[] currPoint : points){
            if(!(currPoint[0]<=currEnd)){
                arrows++;
                currEnd = currPoint[1];
            }
        }        
        return arrows;
    }
}