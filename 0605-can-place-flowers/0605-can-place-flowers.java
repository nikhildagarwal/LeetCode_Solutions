class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1 && flowerbed[0]==0 && n == 1){
            return true;
        }
        int counter = 0;
        if(flowerbed.length>1){
            if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
                counter++;
                flowerbed[flowerbed.length-1] = 1;
            }
            if(flowerbed[0]==0 && flowerbed[1]==0){
                counter++;
                flowerbed[0] = 1;
            }
            
        }
        for(int i = 1;i<flowerbed.length-1;i++){
            if(flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                counter++;
                flowerbed[i] = 1;
            }
        }
        
        if(counter>=n) return true;
        return false;
    }
}