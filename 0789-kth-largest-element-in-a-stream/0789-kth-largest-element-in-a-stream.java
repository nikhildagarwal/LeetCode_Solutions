class KthLargest {
    PriorityQueue<Integer> heap;
    int K;
    public KthLargest(int k, int[] nums) {
        heap = new PriorityQueue<>();
        K = k;
        for(int i = 0;i<nums.length;i++){
            heap.offer(nums[i]);
        }
        while(heap.size()>k){
            heap.poll();
        }
    }
    
    public int add(int val) {
        if(heap.size()>=K){
            int temp = heap.peek();
        if(val<=temp){
            return temp;
        }else{
            heap.poll();
            heap.offer(val);
            return heap.peek();
        }
        }else{
            heap.offer(val);
            return heap.peek();
        }
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */