class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> players = new HashSet<>();
        HashMap<Integer,Integer> losses = new HashMap<>();
        for(int i = 0;i<matches.length;i++){
            int p1 = matches[i][0];
            int p2 = matches[i][1];
            players.add(p1);
            players.add(p2);
            losses.put(p1,0);
            losses.put(p2,0);
        }
        for(int i = 0;i<matches.length;i++){
            int lP = matches[i][1];
            losses.put(lP,losses.get(lP)+1);
        }
        List<Integer> playerL = new ArrayList<>(players);
        List<Integer> win = new ArrayList<>();
        List<Integer> loss = new ArrayList<>();
        for(int i = 0;i<playerL.size();i++){
            int temp = losses.get(playerL.get(i));
            if(temp==0){
                win.add(playerL.get(i));
            }
            if(temp==1){
                loss.add(playerL.get(i));
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        Collections.sort(win);
        Collections.sort(loss);
        result.add(win);
        result.add(loss);
        return result;
        
    }
}