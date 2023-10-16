class Solution {
    public int islandPerimeter(int[][] grid) {
        Set<List<List<Integer>>> edges = new HashSet<>();
        HashMap<List<List<Integer>>,Integer> occ = new HashMap<>();
        int row = grid.length;
        int col = grid[0].length;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(grid[i][j]==1){
                    List<Integer> point1 = new ArrayList<>();
                    List<Integer> point2 = new ArrayList<>();
                    List<Integer> point3 = new ArrayList<>();
                    List<Integer> point4 = new ArrayList<>();
                    point1.add(i);
                    point1.add(j);
                    point2.add(i);
                    point2.add(j+1);
                    point3.add(i+1);
                    point3.add(j);
                    point4.add(i+1);
                    point4.add(j+1);
                    List<List<Integer>> edge1 = new ArrayList<>();
                    List<List<Integer>> edge2 = new ArrayList<>();
                    List<List<Integer>> edge3 = new ArrayList<>();
                    List<List<Integer>> edge4 = new ArrayList<>();
                    edge1.add(point1);
                    edge1.add(point2);

                    edge2.add(point1);
                    edge2.add(point3);

                    edge3.add(point2);
                    edge3.add(point4);

                    edge4.add(point3);
                    edge4.add(point4);

                    edges.add(edge1);
                    edges.add(edge2);
                    edges.add(edge3);
                    edges.add(edge4);
                    occ.put(edge1,occ.getOrDefault(edge1,0)+1);
                    occ.put(edge2,occ.getOrDefault(edge2,0)+1);
                    occ.put(edge3,occ.getOrDefault(edge3,0)+1);
                    occ.put(edge4,occ.getOrDefault(edge4,0)+1);
                }
            }
        }
        List<List<List<Integer>>> setList = new ArrayList<>(edges);
        int perim = 0;
        int setS = setList.size();
        for(int i = 0;i<setS;i++){
            int temp = occ.get(setList.get(i));
            if(temp==1){
                perim++;
            }
        }
        return perim;
    }
}