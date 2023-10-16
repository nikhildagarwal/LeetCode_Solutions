class Solution {
    public boolean isPalindrome(String s) {
        String newS = "";
        for(int i = 0;i<s.length();i++){
            char temp = s.charAt(i);
            int ye = temp;
            if(ye>=65 && ye<=90){
                ye = ye+32;
                char temp1 = (char) ye;
                newS = newS+temp1;
            }else if(ye>=97 && ye<=122){
                newS = newS+s.charAt(i);
            }else if(Character.isDigit(temp)){
                newS = newS+temp;
            }
        }
        //System.out.println(newS);
        if(newS.length()==0){
            return true;
        }
        if(newS.length()==1){
            return true;
        }
        
            int counter = newS.length()-1;
            for(int i = 0;i<newS.length()/2;i++){
                if(newS.charAt(i)!=newS.charAt(counter)){
                    return false;
                }
                counter--;
            }
        
        return true;
    }
}