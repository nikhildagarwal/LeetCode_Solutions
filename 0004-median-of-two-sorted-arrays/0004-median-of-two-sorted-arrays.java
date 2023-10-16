class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> stream = new PriorityQueue<>();
        for(int i = 0;i<nums1.length;i++){
            stream.offer(nums1[i]);
        }
        for(int i = 0;i<nums2.length;i++){
            stream.offer(nums2[i]);
        }
        int c =0;
        int SIZE = stream.size();
        if(SIZE%2==0){
            while(c<SIZE/2 - 1){
                stream.poll();
                c++;
            }
            double a = stream.poll();
            double b = stream.poll();
            return (a+b)/2;
        }else{
            while(c<SIZE/2){
                stream.poll();
                c++;
            }
            double a = stream.poll();
            return a;
        }
    }
}