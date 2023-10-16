class Solution {
public:
    int titleToNumber(string columnTitle) {
        int l = columnTitle.size();
        map<char,int> myMap;
        for(int i = 1;i<=26;i++){
            myMap[static_cast<char>(64+i)] = i;
        }
        
        int digit = 0;
        int ans = 0;
        for(int i = l-1;i>=0;i--){
            int keyInt = myMap[columnTitle.at(i)];
            ans += ( power(26,digit) * keyInt );
            digit++;
        }
        return ans;
    }

    int power(int a, int b){
        if(b==0){
            return 1;
        }
        if(b==1){
            return a;
        }
        int ans = 1;
        while(b>0){
            b--;
            ans *= a;
        }
        return ans;

    }
};