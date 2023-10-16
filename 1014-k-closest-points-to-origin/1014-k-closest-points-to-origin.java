class Solution {
    public int[][] kClosest(int[][] points, int k) {
        double diff = 0.00000001;
        int numOfPoints = points.length;
        if(numOfPoints==k){
            return points;
        }
        PriorityQueue<Double> order = new PriorityQueue<>();
        HashMap<Double,int[]> linear = new HashMap<>();
        for(int i = 0;i<numOfPoints;i++){
            int[] temp = points[i];
            int currX = temp[0];
            int currY = temp[1];
            currX = Math.abs(currX);
            currY = Math.abs(currY);
            double x = Math.pow(currX,2);
            double y = Math.pow(currY,2);
            double added = x+y;
            double sq = Math.sqrt(added);
            sq+=diff;
            diff = diff+0.00000001;
            order.offer(sq);
            linear.put(sq,temp);
        }
        int[][] res = new int[k][2];
        for(int i = 0;i<k;i++){
            res[i] = linear.get(order.poll());
        }
        return res;
    }
}