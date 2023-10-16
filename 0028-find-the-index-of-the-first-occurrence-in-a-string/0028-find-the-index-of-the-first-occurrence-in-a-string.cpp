class Solution {
public:
    int strStr(string haystack, string needle) {
        int needleLength = needle.size();
        int haystackLength = haystack.size();
        for(int i = 0;i<=haystackLength-needleLength;i++){
            string sub = haystack.substr(i,needleLength);
            if(sub == needle){
                return i;
            }
        }
        return -1;
    }
};