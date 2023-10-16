class Solution {
public:
    int maxArea(vector<int>& height) {
        int pL {0};
        int pR = height.size()-1;
        int max {0};
        while(pL<pR){
            int maxHeight = height[pR]>height[pL] ? height[pL]:height[pR];
            int area = ((pR-pL) * maxHeight);
            max =  area>max ? area:max;
            if(height[pL]>height[pR]){
                pR--;
            }else{
                pL++;
            }
        }
        return max;
    }
};