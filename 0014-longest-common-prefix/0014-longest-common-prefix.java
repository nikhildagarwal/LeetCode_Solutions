class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        String smallest = "";
        for(int i = 0;i<strs.length;i++){
            int l = strs[i].length();
            if(l<min){
                min = l;
                smallest = strs[i];
            }
        }
        List<Character> prefix = new ArrayList<>();
        int signal = -1;
        for(int i = 0;i<min;i++){
            char temp = smallest.charAt(i);
            for(int j = 0;j<strs.length;j++){
                char tempy = strs[j].charAt(i);
                if(tempy!=temp){
                    j=strs.length;
                    i = min;
                    signal = 1;
                }
            }
            if(signal<0){
                            prefix.add(temp);

            }
        }
        String result = "";
        for(int i = 0;i<prefix.size();i++){
            result = result+prefix.get(i);
        }
        return result;
    }
}