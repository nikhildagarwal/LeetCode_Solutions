class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(t)){
            return true;
        }
        int index = 0;
        for(int i = 0;i<t.length();i++){
            if(index>=s.length()){
                return true;
            }
            if(t.charAt(i)==s.charAt(index)){
                index++;
            }
            if(index>=s.length()){
                return true;
            }
        }
        return false;
    }
}