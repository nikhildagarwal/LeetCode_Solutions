class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] res = new int[2];
        List<Integer> stones = new ArrayList<>();
        stones.add(a);
        stones.add(b);
        stones.add(c);
        Collections.sort(stones);
        int diff1and2 = stones.get(1)-stones.get(0);
        int diff2and3 = stones.get(2)-stones.get(1);
        if(diff1and2 ==1 && diff2and3==1){
            return res;
        }else if(diff1and2 ==1){
            res[0] = 1;
            res[1] = diff2and3-1;
            return res;
        }else if(diff2and3 ==1){
            res[0] = 1;
            res[1] = diff1and2 -1;
            return res;
        }else if(diff1and2==2 || diff2and3==2){
            res[0] = 1;
            res[1] = diff1and2-1 + diff2and3-1;
            return res;
        }else{
            res[0] = 2;
            res[1] = diff2and3-1 + diff1and2-1;
            return res;
        }
    }
}