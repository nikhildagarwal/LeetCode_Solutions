class Solution {
    public String longestPalindrome(String s) {
        int wL = s.length();
        int max = Integer.MIN_VALUE;
        String finalS = "";
        for(int i = 0;i<wL;i++){
            char temp = s.charAt(i);
            int left = i;
            int right = i;
            String res = ""+temp;
            int signal = 0;
            while(left>0 && right<wL-1 && signal == 0){
                left--;
                right++;
                char lC = s.charAt(left);
                char rC = s.charAt(right);
                if(lC==rC){
                    res = lC+res+rC;
                }else{
                    signal =1;
                }
            }
            if(res.length()>max){
                finalS = res;
                max =res.length();
            }
            if(i<wL-1){
                char curr = s.charAt(i);
                if(curr==s.charAt(i+1)){
                    
                    left = i;
                    right = i+1;
                    res = ""+curr+curr;
                    signal = 0;
                    while(left>0 && right<wL-1 && signal == 0){
                        left--;
                        right++;
                        char lC = s.charAt(left);
                        char rC = s.charAt(right);
                        if(lC==rC){
                            res = lC+res+rC;
                        }else{
                            signal =1;
                        }
                    }
                    if(res.length()>max){
                        finalS = res;
                        max =res.length();
                    }
                }
            }
            
        }
        return finalS;
    }
}