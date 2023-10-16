class Solution {
    public String removeStars(String s) {
        Stack<Character> build = new Stack<>();
        build.push('&');
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                build.push(s.charAt(i));
            }else{
                build.pop();
            }
        }
        String result = "";
        while(build.peek()!='&'){
            result = build.pop()+result;
        }
        return result;
    }
}