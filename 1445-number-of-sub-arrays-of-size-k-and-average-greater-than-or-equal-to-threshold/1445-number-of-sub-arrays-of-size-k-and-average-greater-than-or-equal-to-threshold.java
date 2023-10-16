class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans=0;
        int total = 0;
        int n = arr.length;
        Queue<Integer> stream = new LinkedList<>();
        for(int i = 0;i<n-k+1;i++){
            if(i==0){
                for(int j=0;j<k;j++){
                    stream.add(arr[j]);
                    total+=arr[j];
                }
            }else{
                total-=stream.poll();
                total+=arr[i+k-1];
                stream.add(arr[i+k-1]);
            }
            if(total/k >= threshold) ans++;
        }
        return ans;
    }
}