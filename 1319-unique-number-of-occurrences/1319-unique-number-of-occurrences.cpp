class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        map<int,int> occ;
        for(int n:arr){
            occ[n] = occ[n]+1;
        }
        set<int> mySet;
        for(pair<int,int> thisPair:occ){
            if(mySet.count(thisPair.second)>0){
                return false;
            }
            mySet.insert(thisPair.second);
        }

        return true;
    }
};