class Solution {
    public int maxDepth(String s) {
        Stack<Character> data = new Stack<>();
        int max = 0;
        int counter = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                data.push(s.charAt(i));
                counter++;
            }
            if(s.charAt(i)==')'){
                data.pop();
                counter--;
            }
            if(max<counter){
                max = counter;
            }
        
        }
        return max;
    }
}