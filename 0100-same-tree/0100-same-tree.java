/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Stack<String> treeP;
    Stack<String> treeQ;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        treeP = new Stack<>();
        addToList(p,treeP);
        treeQ = new Stack<>();
        addToList(q,treeQ);
        return treeP.equals(treeQ);
    }

    public void addToList(TreeNode p, Stack<String> treeP){
        if(p==null){
            treeP.push("null");
            return;
        }else{
            treeP.push(Integer.toString(p.val));
        }
        addToList(p.left,treeP);
        addToList(p.right,treeP);
    }
}