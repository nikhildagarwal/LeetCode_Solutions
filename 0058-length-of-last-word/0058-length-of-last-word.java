class Solution {
    public int lengthOfLastWord(String s) {
        
        int length = 0;
        int i = s.length()-1;
        s = s+" ";
                while(s.charAt(i)==' '){
                    i--;
                }
                while(s.charAt(i)!=' ' && i>0){
                    length++;
                    i--;
                }
                if(s.charAt(i)!=' '){
                    length++;
                }
        return length;
        
    }
}