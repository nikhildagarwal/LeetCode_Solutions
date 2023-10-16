class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            if(!words[i].equals("")){
                builder.append(words[i]);
                builder.append(" ");
            }
        }
        String buildString = builder.toString();
        buildString = buildString.substring(0,buildString.length()-1);
        return buildString;
    }
}