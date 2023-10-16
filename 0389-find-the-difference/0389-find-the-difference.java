class Solution {
    public char findTheDifference(String s, String t) {
        List<Character> dataS = new ArrayList<>();
        List<Character> dataT = new ArrayList<>();
        int len = s.length();
        for(int i = 0;i<len;i++){
            dataS.add(s.charAt(i));
            dataT.add(t.charAt(i));
        }
        dataT.add(t.charAt(len));
        while(dataS.size()>0){
            char temp = dataS.get(0);
            dataT.remove(Character.valueOf(temp));
            dataS.remove(0);
        }

        return dataT.get(0);
    }
}