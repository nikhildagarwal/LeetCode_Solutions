class Solution {
public:
    string gcdOfStrings(string str1, string str2) {
        string small;
        string big;
        if(str1.size()>str2.size()){
            big = str1;
            small = str2;
        }else{
            big = str2;
            small = str1;
        }
        for(int i = 0;i<small.size();i++){
            string matcher = small.substr(0,small.size()-i);
            string holder = matcher;
            while(matcher.size()<big.size()){
                matcher += holder;
            }
            if(matcher==big){
                matcher = holder;
                while(matcher.size()<small.size()){
                    matcher += holder;
                }
                if(matcher == small){
                    return holder;
                }
            }
        }
        return "";
    }
};