class Solution {
    public boolean isPowerOfThree(int n) {
         if(n==0){
            return false;
        }
        double base2 = n;
        double x = Math.log(base2)/Math.log(3);
        x = Math.round(x*10000)/10000;
        double rX = Math.round(x);
        if(x!=rX){
            return false;
        }
        double y = Math.pow(3,x);
        if(y==n){
            return true;
        }
        return false;
    }
}