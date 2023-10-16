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
    int max;
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lvl = 0;
        print(root,lvl);
        return max;
    }
    public void print(TreeNode root, int lvl){
        lvl++;
        max = Math.max(max,lvl);
        if(root.left!=null) print(root.left,lvl);
        if(root.right!=null) print(root.right,lvl);
    }
}