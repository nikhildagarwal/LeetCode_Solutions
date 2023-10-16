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
    List<Integer> list1;
    List<Integer> list2;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        print(root1,list1);
        print(root2,list2);
        if(list1.equals(list2)){
            return true;
        }
        return false;
    }
    public static void print(TreeNode root,List<Integer> a){
        if(root==null) return;
        if(root.right==null&&root.left==null){
            a.add(root.val);
        }
        print(root.left,a);
        print(root.right,a);
        
    }
}