class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        int pL = 0;
        int pR = num.length()-1;
        while(pL<pR){
            if(num.charAt(pL) != num.charAt(pR)){
                return false;
            }else{
                pL++;
                pR--;
            }
        }
        return true;
    }
}