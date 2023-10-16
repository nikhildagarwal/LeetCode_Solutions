class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> array1 = new ArrayList<>();
        int l1 = nums1.length;
        for(int i = 0;i<l1;i++){
            array1.add(nums1[i]);
        }
        Set<Integer> hi = new HashSet<>();
        int l2 = nums2.length;
        for(int i = 0;i<l2;i++){
            int temp = nums2[i];
            if(array1.contains(temp)){
                hi.add(temp);
            }
        }
        List<Integer> setList = new ArrayList<>(hi);
        int setS = hi.size();
        int[] res = new int[setS];
        for(int i = 0;i<setS;i++){
            res[i] = setList.get(i);
        }
        return res;
    }
}