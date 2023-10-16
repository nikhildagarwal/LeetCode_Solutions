class Solution {
public:
    string convertToTitle(int columnNumber) {
        map<int,char> myMap;
        
        myMap[0] = 'Z';
        for(int i = 1;i<26;i++){
            char curr = static_cast<char>(64+i);
            myMap[i] = curr;
        }

        string ans = "";
        int remainder = 0;
        while(columnNumber>0){
            remainder = columnNumber % 26;
            columnNumber /= 26;
            if(remainder == 0){
                columnNumber --;
            }
            ans = myMap[remainder] + ans;
        }

        return ans;
        
    }
};