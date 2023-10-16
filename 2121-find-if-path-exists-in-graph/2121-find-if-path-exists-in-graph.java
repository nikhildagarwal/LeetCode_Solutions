class Solution {

    boolean global_ans = false;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer,HashSet<Integer>> graph = new HashMap<>();
        for(int[] a:edges){
          addToGraph(a[0],a[1],graph);
          addToGraph(a[1],a[0],graph);
        }
        HashSet<Integer> visited = new HashSet<>();
        dfs(source,destination, graph, visited);
        return global_ans;
    }

    private static void addToGraph(int node, int next_node, HashMap<Integer,HashSet<Integer>> graph){
      HashSet<Integer> nodes = graph.getOrDefault(node,null);
          if(nodes == null){
            HashSet<Integer> newSet = new HashSet<>();
            newSet.add(next_node);
            graph.put(node, newSet);
            return;
          }
          nodes.add(next_node);
    }

    private void dfs(int start_vertex, int end_vertex, HashMap<Integer,HashSet<Integer>> graph, HashSet<Integer> visited){
      if(start_vertex == end_vertex){
        global_ans = true;
        return;
      }
      if(visited.contains(start_vertex)){
        return;
      }
      HashSet<Integer> next = graph.getOrDefault(start_vertex,null);
      visited.add(start_vertex);
      if(next != null){
        for(int v:next){
          dfs(v,end_vertex,graph,visited);
        }
      }
    }
}