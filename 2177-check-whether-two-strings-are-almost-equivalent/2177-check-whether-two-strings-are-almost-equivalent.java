class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] occ1 = new int[26];
        int[] occ2 = new int[26];
        int len = word1.length();
        Set<Character> unq = new HashSet<>();
        for(int i = 0;i<len;i++){
            char t1 = word1.charAt(i);
            char t2 = word2.charAt(i);
            occ1[t1-97]++;
            occ2[t2-97]++;
            unq.add(t1);
            unq.add(t2);
        }
        for(char item:unq){
            int a = occ1[item-97];
            int b = occ2[item-97];
            int diff = Math.abs(a-b);
            if(diff>3) return false;
        }
        return true;
    }
}