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
    int count;
    
    public int sumNumbers(TreeNode root) {
        count=0;
        String numBuild = "";
        toDepth(root,numBuild);
        
        return count;

    }

    public void toDepth(TreeNode root, String numBuild){
        if(root==null){
            return;
        }
        numBuild+= Integer.toString(root.val);
        if(root.left==null && root.right==null){
            int temp = Integer.parseInt(numBuild);
            count+=temp;
            return;
        }
        toDepth(root.left,numBuild);
        toDepth(root.right,numBuild);
    }
}