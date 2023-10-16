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

    PriorityQueue<Integer> heap;

    public int kthSmallest(TreeNode root, int k) {
        heap = new PriorityQueue<>();
        transverse(root);
        int count = 0;
        while(count<k-1){
            heap.poll();
            count++;
        }
        return heap.peek();
    }

    public void transverse(TreeNode root){
        if(root==null){
            return;
        }
        heap.offer(root.val);
        transverse(root.left);
        transverse(root.right);

    }
}