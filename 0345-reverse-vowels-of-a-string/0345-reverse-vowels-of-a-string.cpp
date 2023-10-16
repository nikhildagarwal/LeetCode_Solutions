class Solution {
public:
    string reverseVowels(string s) {
        set<char> vowelSet {'a','A','e','E','i','I','o','O','u','U'};
        vector<char> stream;
        int l = s.size();
        for(char n:s){
            if(vowelSet.count(n)>0) stream.emplace_back(n);
        }
        string ans{};
        int pR = stream.size()-1;
        for(char n:s){
            if(vowelSet.count(n)>0){
                ans += stream[pR];
                pR--;
            }else{
                ans += n;
            }
        }
        return ans;
    }
};