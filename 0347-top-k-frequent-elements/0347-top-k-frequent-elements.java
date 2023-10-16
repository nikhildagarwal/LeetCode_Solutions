class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> occ = new HashMap<>();
        Set<Integer> unq = new HashSet<>();
        int len = nums.length;
        for(int i = 0;i<len;i++){
            occ.put(nums[i],occ.getOrDefault(nums[i],0)+1);
            unq.add(nums[i]);
        }
        
        List<Integer> single = new ArrayList<>(unq);
        List<Integer> multiple = new ArrayList<>();
        int hi = single.size();
        for(int i = 0;i<hi;i++){
            multiple.add(occ.get(single.get(i)));
        }
        double small = 0.0000001;
        double smallI = 0.0000001;
        List<Double> sD = new ArrayList<>();
        HashMap<Double,Integer> real = new HashMap<>();
        for(int i = 0;i<hi;i++){
            double temp = multiple.get(i)+small;
            sD.add(temp);
            small+=smallI;
            real.put(temp,single.get(i));
        }
        Collections.sort(sD);
        int[] res = new int[k];
        int counter = hi-1;
        for(int i = 0;i<k;i++){
            res[i] = real.get(sD.get(counter));
            counter--;
        }
        return res;
    }
}