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
    ArrayList<TreeNode> data;
    public void flatten(TreeNode root) {
        if(root==null || root.left==null && root.right==null){
            
        }else{
            TreeNode holder = root;
        data = new ArrayList<>();
        addToList(holder);
        for(int i = 0;i<data.size()-1;i++){
            TreeNode t1 = data.get(i);
            TreeNode t2 = data.get(i+1);
            t1.right = t2;
            t1.left = null;
        }
        root = data.get(0);
        }
        
    }

    public void addToList(TreeNode root){
        if(root==null){
            return;
        }
        data.add(root);
        addToList(root.left);
        addToList(root.right);
    }
}