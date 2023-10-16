class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        int n = s.length();
        if(n<=10) return ans;
        Set<String> unq = new HashSet<>();
        for(int i = 0;i<n-9;i++){
            String curr = s.substring(i,i+10);
            if(unq.contains(curr) && !ans.contains(curr)){
                ans.add(curr);
            }else{
                unq.add(curr);
            }
        }
        return ans;
    }
}