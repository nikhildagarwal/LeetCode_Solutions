class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sWord = new Stack<>();
        Stack<Character> tWord = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char temp = s.charAt(i);
            if(temp=='#'){
                if(!sWord.empty())  sWord.pop();
                
            }else{
                sWord.push(temp);
            }
        }
        for(int i = 0;i<t.length();i++){
            char temp = t.charAt(i);
            if(temp=='#'){
                if(!tWord.empty())  tWord.pop();
            }else{
                tWord.push(temp);
            }
        }
        return sWord.equals(tWord);
        
    }
}