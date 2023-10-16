/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        int depth = 0;
        Node start = root;
        while(start!=null){
            depth++;
            start = start.right;
        }
        ArrayList<ArrayList<Node>> horizontals = new ArrayList<>();
        for(int i = 0;i<depth;i++){
            horizontals.add(new ArrayList<Node>());
        }
        traverse(horizontals,root,0);
        for(int i = 0;i<depth;i++){
            ArrayList<Node> currLevel = horizontals.get(i);
            int l = currLevel.size();
            for(int j = 0;j<l-1;j++){
                currLevel.get(j).next = currLevel.get(j+1);
            }
            currLevel.get(l-1).next = null;
        }
        return root;
    }

    public void traverse(ArrayList<ArrayList<Node>> horizontals, Node root, int level){
        if(root == null){
            return;
        }
        horizontals.get(level).add(root);
        traverse(horizontals, root.left,level+1);
        traverse(horizontals,root.right,level+1);
    }
}