class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        for(int i = 0;i<nums1.length;i++){
            a1.add(nums1[i]);
        }
        for(int i = 0;i<nums2.length;i++){
            a2.add(nums2[i]);
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i<a1.size();i++){
            int temp = a1.get(i);
            if(a2.contains(temp)){
                res.add(temp);
                a2.remove(Integer.valueOf(temp));
                a1.remove(i);
                i--;
            }
        }
        int[] fin = new int[res.size()];
        for(int i = 0;i<res.size();i++){
            fin[i] = res.get(i);
        }
        return fin;
    }
}