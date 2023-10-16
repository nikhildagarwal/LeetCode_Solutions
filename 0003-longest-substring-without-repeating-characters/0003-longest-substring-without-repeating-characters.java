class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Queue<Character> stream = new LinkedList<>();
        for(int i =0;i<s.length();i++){
            char curr = s.charAt(i);
            if(stream.contains(curr)){
                stream.offer(curr);
                while(stream.peek()!=curr){
                    stream.poll();
                }
                stream.poll();
            }else{
                stream.offer(curr);
            }
            max = Math.max(stream.size(),max);
        }
        return max;
    }
}