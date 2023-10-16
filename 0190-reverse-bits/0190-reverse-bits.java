public class Solution {
    // you need treat n as an unsigned value
    private static int power2(int a){
        if(a==0){
            return 1;
        }
        return 2*power2(a-1);
    }
    
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        for(int i = s.length();i<32;i++){
            s ="0"+s;
        }
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            char temp = s.charAt(i);
            if(temp=='1'){
                sum = sum + power2(i);
                
            }
        }
        return sum;
    }
}