class Solution {
    public int mySqrt(int x) {
        if(x>=2147395600){
            return 46340;
        }else{
            int signal = -1;
        int counter1 = 0;
        int counter2 = 1;
        int result = -1;
        while(signal<0){
            int a = counter1*counter1;
            int b = counter2*counter2;
            if(a<=x && x<b){
                result = counter1;
                signal = 1;
            }
            counter1++;
            counter2++;
        }

        return result;
        }
        
    }
}