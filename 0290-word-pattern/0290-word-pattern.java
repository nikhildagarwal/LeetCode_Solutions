class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] patterA = pattern.toCharArray();
        s = " "+s+" ";
        List<String> words= new ArrayList<>();
        for(int i = 0;i<s.length()-1;i++){
            char temp = s.charAt(i);
            int count = i;
            if(temp==' ' && i+1<s.length()){
                i++;
                count++;
                while(s.charAt(count)!=' '){
                    count++;
                }
                String hello = s.substring(i,count);
                if(hello.charAt(0)==' '){
                    hello = hello.substring(1);
                }
                words.add(hello);
            }
            i = count;
            i--;
        }
        if(words.size()!=patterA.length){
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        List<Character> unq = new ArrayList<>();
        for(int i = 0;i<patterA.length;i++){
            if(!unq.contains(patterA[i])){
                unq.add(patterA[i]);
            }
            char temp = patterA[i];
            String TEMP = words.get(i);
            if(map.get(temp)==null){
                map.put(temp,TEMP);
            }
        }
        Set<String> check = new HashSet<>();
        for(int i =0;i<unq.size();i++){
            check.add(map.get(unq.get(i)));
        }
        if(check.size()<unq.size()){
            return false;
        }
        String comp = " ";
        for(int i = 0;i<patterA.length;i++){
            String temp = map.get(patterA[i]);
            comp = comp + temp+" ";
        }
        return s.equals(comp);
    }
}