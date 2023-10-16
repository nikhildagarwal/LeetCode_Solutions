class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> occ = new HashMap<>();
        Set<Integer> unq = new HashSet<>();

        for(int i = 0;i<nums.length;i++){
            int curr = nums[i];
            occ.put(curr,occ.getOrDefault(curr,0)+1);
            unq.add(curr);
        }
        List<Integer> h = new ArrayList<>(unq);
        int[] hello = new int[h.size()];
        for(int i = 0;i<h.size();i++){
            hello[i] = h.get(i);
        }   
        Arrays.sort(hello);
        
        int result = 0;
        int counter = 0;
        for(int i = 0;i<hello.length;i++){
            
            int temp = occ.get(hello[i]);
            if(temp>=2){
                for(int j = 0;j<2;j++){
                    nums[counter] = hello[i];
                    counter++;
                }
            }else{
                nums[counter] = hello[i];
                counter++;
            }
        }
        return counter;
    }
}