class Solution {
public:
    int maxVowels(string s, int k) {
        int n = s.size();
        int max {0};
        int count {0};
        for(int i = 0;i<k;i++){
            if(checkVowel(s[i])){
                count++;
            }
        }
        max = count>max ? count:max;
        for(int i = 1;i<=n-k;i++){
            if(checkVowel(s[i+k-1])){
                count++;
            }
            if(checkVowel(s[i-1])){
                count--;
            }
            max = count>max ? count:max;
        }
        return max;
    }

    bool checkVowel(char curr){
        if(curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u'){
            return true;
        }
        return false;
    }
};