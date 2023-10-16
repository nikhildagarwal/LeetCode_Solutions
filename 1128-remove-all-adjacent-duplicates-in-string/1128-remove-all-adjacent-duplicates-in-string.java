class Solution {
    

    public String removeDuplicates(String s) {
        if(s.length()==1){
            return s;
        }else{
            Stack<Character> build = new Stack<>();
            build.push('%');
            
            build.push(s.charAt(0));
            
            for(int i = 1;i<s.length();i++){

                if(s.charAt(i)==build.peek()){
                    build.pop();
                }else{
                    build.push(s.charAt(i));
                    
                }

            }
            String result = "";
            int lar = build.size();
            for(int i = 1;i<lar;i++){
                result = build.pop()+result;
            }
            return result;
        }
        
    }
}