class Solution {

    public int maxVowels(String s, int k) {
        int max = 0;
        int n = s.length();
        Queue<Character> stream = new LinkedList<>();
        int vC =0;
        for(int i = 0;i<n-k+1;i++){
            if(i==0){
                for(int j = 0;j<k;j++){
                    char curr = s.charAt(j);
                    if(curr=='a'||curr=='e'||curr=='i'||curr=='o'||curr=='u') vC++;
                    stream.add(curr);
                }
            }else{
                char out = stream.poll();
                if(out=='a'||out=='e'||out=='i'||out=='o'||out=='u') vC--;
                char p = s.charAt(i+k-1);
                if(p=='a'||p=='e'||p=='i'||p=='o'||p=='u') vC++;
                stream.add(p);
            }
            max = Math.max(vC,max);
        }
        return max;
    }
}