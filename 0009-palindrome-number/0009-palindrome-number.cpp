class Solution {
public:
    bool isPalindrome(int x) {
        string numberString = to_string(x);
        int pL = 0;
        int pR = numberString.size()-1;
        while(pL<pR){
            if(numberString.at(pL)!=numberString.at(pR)){
                return false;
            }
            pL++;
            pR--;
        }
        return true;
    }
};