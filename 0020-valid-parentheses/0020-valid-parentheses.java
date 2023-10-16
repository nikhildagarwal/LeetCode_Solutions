class Solution {
    public boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }else{
            Stack<Character> data = new Stack<>();
            data.push('r');
            for(int i =0;i<s.length();i++){
                char temp = s.charAt(i);
                if(temp == '(' || temp=='[' || temp == '{'){
                    data.push(temp);
                }else if(temp == ')'){
                    if(data.peek()=='('){
                        data.pop();
                    }else{
                        return false;
                    }
                }else if(temp=='}'){
                    if(data.peek()=='{'){
                        data.pop();
                    }else{
                        return false;
                    }
                }else{
                    if(data.peek()=='['){
                        data.pop();
                    }else{
                        return false;
                    }
                }
            }
            if(data.peek()=='r'){
                return true;
            }else{
                return false;
            }


        }
        


    }
}