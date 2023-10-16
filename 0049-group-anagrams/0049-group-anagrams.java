class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String word = strs[i];
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);
            String newWord = new String(wordArray);
            if(map.get(newWord)==null){
                List<String> temp = new ArrayList<>();
                temp.add(word);
                map.put(newWord,temp);
            }else{
                map.get(newWord).add(word);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String a:map.keySet()){
            ans.add(map.get(a));
        }
        return ans;
    }
        
}