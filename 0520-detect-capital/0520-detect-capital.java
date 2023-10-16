class Solution {
    public boolean detectCapitalUse(String word) {
        int cap = 0;
        int low = 0;
        char first = word.charAt(0);
        int firstN = first;
        for(int i = 0;i<word.length();i++){
            char temp = word.charAt(i);
            int tempN = temp;
            if(tempN<97){
                cap++;
            }else{
                low++;
            }
        }
        if(low==0 || cap==0){
            return true;
        }else if(cap==1 && firstN<97){
            return true;
        }else{
            return false;
        }
    }
}