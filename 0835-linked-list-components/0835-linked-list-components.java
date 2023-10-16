/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        
        Set<Integer> data = new HashSet<>();
        int len = nums.length;
        for(int i = 0;i<len;i++){
            data.add(nums[i]);
        }
        
        while(head.next!=null){
            int t1 = head.val;
            int t2 = head.next.val;
            if(data.contains(t1) && data.contains(t2)){
                len--;
            }
            head = head.next;
        }
        return len;
    }
}