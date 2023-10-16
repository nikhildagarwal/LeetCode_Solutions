class Solution {
    public String reverseVowels(String s) {
        Stack<Character> reverse = new Stack<>();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');
        for(int i = 0;i<s.length();i++){
            char temp = s.charAt(i);
            if(vowels.contains(temp)){
                reverse.push(temp);
            }
        }
        String result = "";
        for(int i = 0;i<s.length();i++){
            char temp = s.charAt(i);
            if(vowels.contains(temp)){
                result+=reverse.pop();
            }else{
                result+=temp;
            }
            
        }
        return result;
    }
}