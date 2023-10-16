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
    List<Integer> result;
    public List<Integer> preorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        addToList(root);
        return result;

    }

    public void addToList(TreeNode root){
        if(root==null){
            return;
        }
        result.add(root.val);
        addToList(root.left);
        addToList(root.right);
    }
}