class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int pR = digits.size()-1;
        digits[pR] += 1;
        while(pR>=0){
            if(pR==0){
                if(digits[0] >9){
                    digits[pR] -= 10;
                    digits.insert(digits.begin(),1);
                }
            }else{
                if(digits[pR] > 9){
                    digits[pR] -= 10;
                    digits[pR-1] += 1;
                }
            }
            pR--;
        }
        return digits;
    }
};