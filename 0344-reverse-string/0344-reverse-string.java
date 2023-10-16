class Solution {
    public void reverseString(char[] s) {
    int counter = s.length-1;
    int length = s.length;
            
            for(int i = 0;i<length/2;i++){
                char temp = s[i];
                s[i] = s[counter];
                s[counter] = temp;
                counter--;
            }
        
    }
}