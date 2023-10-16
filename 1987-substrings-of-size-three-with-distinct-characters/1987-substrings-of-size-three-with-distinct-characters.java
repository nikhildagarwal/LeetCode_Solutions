class Solution {
    public int countGoodSubstrings(String s) {
        int sL = s.length();
        int ans = 0;
        for(int i = 0;i<sL-2;i++){
            boolean one = s.charAt(i) != s.charAt(i+1);
            boolean two = s.charAt(i+1) != s.charAt(i+2);
            boolean three = s.charAt(i) != s.charAt(i+2);
            if(one && two && three) ans++;
        }
        return ans;
    }
}