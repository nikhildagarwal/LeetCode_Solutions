class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int nL = nums.length;
        int len = queries.length;
        int[] res = new int[len];
        for(int i = 0;i<len;i++){
            int sum = queries[i];
            int count = 0;
            int counter = 0;
            if(nums[count]>sum){
                res[i] = 0;
            }else{
                int tempSum = 0;
                int singal = 0;
                while(tempSum<=sum && count<nL){
                    tempSum+=nums[count];
                    count++;
                    counter++;
                }
                if(tempSum>sum){
                    counter--;
                }
                res[i] = counter;
            }
        }
        return res;
    }
}