/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode result;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        traverse(original,cloned,target);
        return result;
    }

    public void traverse(TreeNode original, TreeNode cloned, TreeNode target){
        if(original==null) return;
        if(original == target){
            result = cloned;
            return;
        }
        traverse(original.left,cloned.left,target);
        traverse(original.right,cloned.right,target);
    }
}