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
    
    
    
    public int sumOfLeftLeaves(TreeNode root) {
        int[] holder = new int[1];
        traversal(root,false,holder);
        return holder[0];
    }
    
    private static void traversal(TreeNode root, boolean movedLeft, int[] holder){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null && movedLeft){
            holder[0]+=root.val;
        }
        traversal(root.right,false,holder);
        traversal(root.left,true,holder);
    }
}