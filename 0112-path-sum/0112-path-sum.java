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
    boolean res;
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        res = false;
        if(root==null){
            return res;
        }
        int sum = 0;
        pathSum(root,sum,targetSum);
        return res;
    }

    public void pathSum(TreeNode root, int sum, int targetSum){
        if(root==null){
            return;
        }
        sum+=root.val;
        if(sum==targetSum && root.left==null && root.right==null){
            res = true;
        }
        pathSum(root.left,sum,targetSum);
        pathSum(root.right,sum,targetSum);
    }
}