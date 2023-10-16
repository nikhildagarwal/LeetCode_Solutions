class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> bottom = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        List<Integer> top = new ArrayList<>();
        int[] result = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>pivot){
                top.add(nums[i]);
            }else if(nums[i]<pivot){
                bottom.add(nums[i]);
            }else{
                mid.add(nums[i]);
            }
        }
        int counter = 0;
        for(int i = 0;i<bottom.size();i++){
            result[counter] = bottom.get(i);
            counter++;
        }
        for(int i = 0;i<mid.size();i++){
            result[counter] = mid.get(i);
            counter++;
        }
        for(int i = 0;i<top.size();i++){
            result[counter] = top.get(i);
            counter++;
        }
        return result;
    }
}