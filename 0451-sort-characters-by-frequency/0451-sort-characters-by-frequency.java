class Solution {
    private static int getMaxIndex(List<Integer> a){
        int index = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<a.size();i++){
            if(a.get(i)>=max){
                max = a.get(i);
                index = i;
            }
        }
        return index;
    }
    public String frequencySort(String s) {
        Set<Character> build = new HashSet<>();
        HashMap<Character,Integer> occ = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char temp = s.charAt(i);
            build.add(temp);
            occ.put(temp,occ.getOrDefault(temp,0)+1);
        }
        List<Character> bL = new ArrayList<>(build);
        List<Integer> freq = new ArrayList<>();
        for(int i = 0;i<bL.size();i++){
            int temp = occ.get(bL.get(i));
            freq.add(temp);
        }
        List<String> result = new ArrayList<>();
        int times = freq.size();
        for(int i = 0;i<times;i++){
            int index = getMaxIndex(freq);
            String res = "";
            for(int j = 0;j<freq.get(index);j++){
                res+=bL.get(index);
            }
            result.add(res);
            freq.remove(index);
            bL.remove(index);
        }
        String fin = "";
        for(int i = 0;i<result.size();i++){
            fin+=result.get(i);
        }
        return fin;
    }
}