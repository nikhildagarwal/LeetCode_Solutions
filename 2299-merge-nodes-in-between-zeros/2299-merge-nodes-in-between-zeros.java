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
    public ListNode mergeNodes(ListNode head) {
        
        head = head.next;
        ListNode holder = head;
        ListNode start = head;
        while(head!=null){
            int temp = head.val;
            while(head.val!=0){
                head = head.next;
                temp = temp+head.val;
            }
            head = head.next;
            holder.val = temp;
            holder.next = head;
            holder = head;
        }
        
        return start;
    }
}