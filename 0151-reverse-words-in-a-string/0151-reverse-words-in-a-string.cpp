class Solution {
public:
    string reverseWords(string s) {
        string ans = "";
        string temp = "";
        for(char curr:s){
            if(curr == ' '){
                if(temp!=""){
                    ans = temp+" "+ans;
                    temp = "";
                }
            }else{
                temp+=curr;
            }
        }
        if(temp!=""){
                    ans = temp+" "+ans;
                    
                }
        return ans.substr(0,ans.size()-1);
    }
};