class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int pL = 0;
        int pR = numbers.length-1;
        while(pL!=pR){
            int sum = numbers[pR]+numbers[pL];
            if(sum>target){
                pR--;
            }else if(sum<target){
                pL++;
            }else{
                
                result[0] = pL+1;
                result[1] = pR+1;
                pR = pL;
                
            }
        }
        return result;
    }
}