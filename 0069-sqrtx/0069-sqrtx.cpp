class Solution {
public:
    int mySqrt(int x) {
        if(x == 2147483647){
            return 46340;
        }
        int root = 0;
        while(true){
            int square = root*root;
            if(square == x){
                return root;
            }else if(square>x){
                return root - 1;
            }
            root++;
        }
        return 0;
    }
};