class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        Queue<Character> stream = new LinkedList<>();
        int min = k+1;
        int count =0;
        for(int i = 0;i<k;i++){
            char curr = blocks.charAt(i);
            if(curr=='W') count++;
            stream.add(curr);
        }
        min = Math.min(min,count);
        if(min==0) return 0;
        for(int i = k;i<n;i++){
            if(stream.poll()=='W') count--;
            char put = blocks.charAt(i);
            if(put=='W') count++;
            stream.add(put);
            min = Math.min(min,count);
            if(min==0) return 0;
        }
        
        return min;
    }
}