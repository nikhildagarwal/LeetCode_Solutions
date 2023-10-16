class Solution {
public:
    int lengthOfLastWord(string s) {
        if(s==" "){
            return 0;
        }
        s = " "+s;
        int l = s.size();
        int pR = l-1;
        if(s.at(l-1) == ' '){
            pR--;
            while(s.at(pR) == ' '){
                pR--;
            }
        }
        int count = 0;
        while(s.at(pR) != ' '){
            pR--;
            count++;
        }
        return count;
    }
};