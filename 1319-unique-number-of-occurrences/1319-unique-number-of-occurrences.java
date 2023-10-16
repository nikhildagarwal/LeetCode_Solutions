class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> occ = new HashMap<>();
        Set<Integer> nums = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            occ.put(arr[i],occ.getOrDefault(arr[i],0)+1);
            nums.add(arr[i]);
        }
        List<Integer> numberL = new ArrayList<>(nums);
        Set<Integer> occUn = new HashSet<>();
        for(int i = 0;i<numberL.size();i++){
            occUn.add(occ.get(numberL.get(i)));
        }
        if(occUn.size()==nums.size()){
            return true;
        }
        return false;
    }
}