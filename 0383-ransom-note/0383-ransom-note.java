class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> maga = new ArrayList<>();
        for(int i = 0;i<magazine.length();i++){
            maga.add(magazine.charAt(i));
        }
        for(int i = 0;i<ransomNote.length();i++){
            char temp = ransomNote.charAt(i);
            if(maga.contains(temp)){
                maga.remove(Character.valueOf(temp));
            }else{
                return false;
            }
        }
        return true;
    }
}