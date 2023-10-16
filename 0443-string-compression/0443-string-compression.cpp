class Solution {
public:
    int compress(vector<char>& chars) {
        map<int,char> conversion;
        conversion[2] = '2';
        conversion[3] = '3';
        conversion[4] = '4';
        conversion[5] = '5';
        conversion[6] = '6';
        conversion[7] = '7';
        conversion[8] = '8';
        conversion[9] = '9';
        vector<char> temp;
        if(chars.size()==1) return 1;
        char curr = chars[0];
        int currCount {1};
        int ans {0};
        for(int i = 1;i<chars.size();i++){
            if(chars[i]!=curr){
                temp.emplace_back(curr);
                ans++;
                if(currCount>1 && currCount<10){
                    temp.emplace_back(conversion[currCount]);
                    ans++;
                    currCount = 1;
                }else if(currCount>=10){
                    string numberString = to_string(currCount);
                    for(char n:numberString){
                        temp.emplace_back(n);
                        ans++;
                    }
                    currCount = 1;
                }
                curr = chars[i];
            }else{
                currCount++;
            }
        }
        temp.emplace_back(curr);
        ans++;
                if(currCount>1 && currCount<10){
                    temp.emplace_back(conversion[currCount]);
                    ans++;
                }else if(currCount>=10){
                    string numberString = to_string(currCount);
                    for(char n:numberString){
                        temp.emplace_back(n);
                        ans++;
                    }
                }
        chars = temp;
        return ans;
    }
};