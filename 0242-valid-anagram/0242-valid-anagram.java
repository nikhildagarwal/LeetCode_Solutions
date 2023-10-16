class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }else{
            char[] S = s.toCharArray();
            char[] T = t.toCharArray();
            Arrays.sort(S);
            Arrays.sort(T);
            for(int i = 0;i<T.length;i++){
                if(T[i]!=S[i]){
                    return false;
                }
            }
            return true;
        }
    }
}