class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> charToIndex = new HashMap<>();
        char[] orderArray = order.toCharArray();
        int c = 0;
        for(char curr:orderArray){
            charToIndex.put(curr,c);
            c++;
        }
        for(int i = 0;i<words.length-1;i++){
            if(!words[i].equals(words[i+1])){
                int max = Math.min(words[i].length(),words[i+1].length());
            //System.out.println(max);
            String nw1 = words[i].substring(0,max);
            String nw2 = words[i+1].substring(0,max);
            int longerWord = getLongerWord(words[i],words[i+1]);
            //System.out.println(longerWord);
            boolean valid = false;
            for(int j = 0;j<max;j++){
                int x = Integer.compare(charToIndex.get(nw1.charAt(j)),charToIndex.get(nw2.charAt(j)));
                if(x==-1){
                    valid = true;
                    break;
                }
                if(x==1){
                    return false;
                }
            }
            if(valid==false){
                if(longerWord==1){
                    return false;   
                }
            }
            }
            
        }
        return true;
    }

    public int getLongerWord(String s1,String s2){
        if(s1.length()>=s2.length()){
            return 1;
        }else{
            return 2;
        }
    }
}