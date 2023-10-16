
  
import java.util.*;

class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int a = capacity.length;
        int[] data = new int[a];
        for(int i = 0;i<a;i++){
            data[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(data);
        int maxBags = 0;
        for(int i = 0;i<a;i++){
            
            if(!(additionalRocks-data[i]<0)){
                additionalRocks-=data[i];
                maxBags++;
            }
        }
        return maxBags;
    }
}