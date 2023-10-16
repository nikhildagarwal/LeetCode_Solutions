class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> data = new PriorityQueue<>(Collections.reverseOrder());
        int len = piles.length;
        int sum = 0;
        for(int i = 0;i<len;i++){
            sum+=piles[i];
            data.add(piles[i]);
        }
        for(int i = 0;i<k;i++){
            int temp = data.poll();
            sum-=temp;
            int a = temp/2;
            if(a*2 < temp){
                a++;
            }
            data.add(a);
            sum+=a;
        }
        return sum;
    }
}