class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int max {0};
        int alt {0};
        for(int n:gain){
            alt += n;
            max = alt>max ? alt:max;
        }
        return max;
    }
};