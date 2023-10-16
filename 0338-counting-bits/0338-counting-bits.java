class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i = 0;i<=n;i++){
            int temp = i;
            int counter = 0;
            while(temp!=0){
                int mod = temp%2;
                temp = temp/2;
                if(mod==1){
                    counter++;
                }
            }
            result[i] = counter;
        }
        return result;
    }
}