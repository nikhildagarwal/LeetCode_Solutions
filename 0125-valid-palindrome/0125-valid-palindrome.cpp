class Solution {
public:
    bool isPalindrome(string s) {
        transform(s.begin(),s.end(),s.begin(),[](unsigned char c){
            return tolower(c);
        });
        set<char> mySet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
        string newS;
        int l = s.size();
        for(int i = 0;i<l;i++){
            if(mySet.count(s.at(i))>0){
                newS += s.at(i);
            }
        }
        int pL = 0;
        int pR = newS.size()-1;
        while(pL<pR){
            if(newS.at(pL)!=newS.at(pR)){
                return false;
            }
            pR--;
            pL++;
        }
        return true;
    }
};