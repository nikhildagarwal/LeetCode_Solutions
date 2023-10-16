class Solution {
public:
    bool isSubsequence(string s, string t) {
        int pointer = 0;
        for(int i=0;i<t.size();i++){
            if(pointer==s.size()){
                return true;
            }
            if(t.at(i)==s.at(pointer)){
                pointer++;
            }
        }
        return pointer == s.size();
    }
};