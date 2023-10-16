class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        int l1 = word1.size();
        int l2 = word2.size();
        int pR = 0;
        string ans;
        while(pR<l1 && pR<l2){
            ans += word1.at(pR);
            ans += word2.at(pR);
            pR++;
        }
        if(pR==l1 && pR != l2){
            ans += word2.substr(pR,l2-pR);
        }else if(pR == l2 && pR != l1){
            ans += word1.substr(pR,l1-pR);
        }
        return ans;
    }
};