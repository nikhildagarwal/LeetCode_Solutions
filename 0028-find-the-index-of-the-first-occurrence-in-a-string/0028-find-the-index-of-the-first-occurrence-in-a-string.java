class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        int haystackLength = haystack.length();
        for(int i =0;i<=haystackLength-needleLength;i++){
            if(i==haystackLength-needleLength){
                String haysub = haystack.substring(i);
                if(haysub.equals(needle)){
                    return i;
                }
            }else{
                String haysub = haystack.substring(i,i+needleLength);
                if(haysub.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}