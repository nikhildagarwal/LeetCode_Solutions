class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        int l = flowerbed.size();
        if(l==1){
            if(flowerbed[0] == 1){
                return n>0 ? false:true;
            }else{
                return n>1 ? false:true;
            }
        }
        for(int i = 0;i<l;i++){
            if(flowerbed[i] == 0){
                if(i==0){
                    if(flowerbed[i+1]==0){
                        flowerbed[i] = 1;
                        n--;
                    }
                }else if(i == l-1){
                    if(flowerbed[i-1]==0){
                        flowerbed[i] = 1;
                        n--;
                    }
                }else{
                    if(flowerbed[i+1] == 0 && flowerbed[i-1] == 0){
                        flowerbed[i] = 1;
                        n--;
                    }
                }
            }
            if(n <= 0){
                return true;
            }
        }
        return n>0 ? false:true;
        
    }
};