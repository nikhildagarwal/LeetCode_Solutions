class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        Set<List<Integer>> data = new HashSet<>();
        for(int i = ax1;i<ax1+ (ax2-ax1);i++){
            for(int j = ay1;j<ay1+(ay2-ay1);j++){
                List<Integer> point = new ArrayList<>();
                point.add(i);
                point.add(j);
                data.add(point);
            }
        }
        for(int i = bx1;i<bx1+ (bx2-bx1);i++){
            for(int j = by1;j<by1+(by2-by1);j++){
                List<Integer> point = new ArrayList<>();
                point.add(i);
                point.add(j);
                data.add(point);
            }
        }
        return data.size();
    }
}