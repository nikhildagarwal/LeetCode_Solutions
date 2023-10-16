class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        String a = s.substring(0,s.length()/2);
        String b = s.substring(s.length()/2);
        int countA = 0;
        int countB = 0;
        for(int i = 0;i<a.length();i++){
            if(vowels.contains(a.charAt(i))){
                countA++;
            }
            if(vowels.contains(b.charAt(i))){
                countB++;
            }
        }
        if(countA==countB){
            return true;
        }
        
        return false;
    }
}