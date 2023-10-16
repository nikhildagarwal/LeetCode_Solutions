class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Set<String> unq = new HashSet<>();
        HashMap<String,Integer> occ = new HashMap<>();
        for(int i = 0;i<words.length;i++){
            String curr = words[i];
            unq.add(curr);
            occ.put(curr,occ.getOrDefault(curr,0)+1);
        }
        List<String> unqWords = new ArrayList<>(unq);
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        HashMap<Integer,PriorityQueue<String>> reverse = new HashMap<>();
        for(int i = 0;i<unqWords.size();i++){
            int occurence = occ.get(unqWords.get(i));
            heap.offer(occurence);
            if(reverse.get(occurence)==null){
                PriorityQueue<String> tempy = new PriorityQueue<>();
                tempy.offer(unqWords.get(i));
                reverse.put(occurence,tempy);
            }else{
                reverse.get(occurence).offer(unqWords.get(i));
            }

        }
        while(heap.size()>k){
            heap.poll();
        }
        int counter = 0;
        List<List<String>> result = new ArrayList<>();
        while(!heap.isEmpty()){
            PriorityQueue<String> hi = reverse.get(heap.poll());
            List<String> temp = new ArrayList<>();
            while(!hi.isEmpty()){
                temp.add(hi.poll());
            }
            if(!temp.isEmpty()){
                result.add(0,temp);
            }
        }
        List<String> finalR = new ArrayList<>();
        for(int i = 0;i<result.size();i++){
            for(int j=0;j<result.get(i).size();j++){
                finalR.add(result.get(i).get(j));
                if(finalR.size()==k){
                    break;
                }
            }
        }
        return finalR;
    }
}