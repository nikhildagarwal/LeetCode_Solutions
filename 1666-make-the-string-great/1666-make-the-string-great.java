class Solution {
    public String makeGood(String s) {
        if(s.equals("")){
            return "";
        }else if(s.length()==1){
            return s;
        }else{
            boolean hasBeen = false;
            int signal = -1;
            while(signal<0){
                int Length = s.length();
                String temp = s;
                
                for(int i = 0;i<Length-1;i++){
                    char temp1 = s.charAt(i);
                    char temp2 = s.charAt(i+1);
                    int lex1 = temp1;
                    int lex2 = temp2;
                    int diff = Math.abs(lex1-lex2);
                    if(diff == 32){
                        s = s.substring(0,i)+s.substring(i+2);
                        i = Length;
                    }
                }
                hasBeen = true;
                if(temp.equals(s) && hasBeen==true){
                    signal = 1;
                }
            }   
            return s;
        }
    }
}