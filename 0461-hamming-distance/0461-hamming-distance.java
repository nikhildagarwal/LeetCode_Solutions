class Solution {
    public int hammingDistance(int x, int y) {
        String X = Integer.toBinaryString(x);
        String Y = Integer.toBinaryString(y);
        while(X.length()!=Y.length()){
            if(X.length()<Y.length()){
                X = '0'+X;
            }else{
                Y = '0'+Y;
            }
        }
        int counter = 0;
        for(int i = 0;i<X.length();i++){
            char temp1 = X.charAt(i);
            char temp2 = Y.charAt(i);
            if(temp1!=temp2){
                counter++;
            }
        }
        return counter;
    }
}