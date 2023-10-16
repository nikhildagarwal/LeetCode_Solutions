class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int minLength = numeric_limits<int>::max();
        int index = -1;
        string prefix = "";
        int lengthArray = strs.size();
        if(lengthArray==1){
            return strs[0];
        }
        for(int i = 0;i<lengthArray;i++){
            if(strs[i].size()<minLength){
                minLength = strs[i].size();
                index = i;
            }
        }
        string firstWord = strs[index];
        int lengthFirstWord = firstWord.size();
        for(int i = 0;i<lengthFirstWord;i++){
            char currChar = firstWord.at(i);
            for(int j = 0;j<lengthArray;j++){
                if(strs[j].at(i)!=currChar){
                    return prefix;
                }
            }
            prefix += currChar;
        }
        return firstWord;
    }
};