class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> occurence = new HashMap<>();
        int Length = s.length();
        for(int i = 0;i<Length;i++){
            occurence.put(s.charAt(i),occurence.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0;i<Length;i++){
            if(occurence.get(s.charAt(i))==1){
                return i;
                
            }
        }
        return -1;
    }
}