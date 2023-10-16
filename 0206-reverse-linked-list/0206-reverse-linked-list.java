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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }else{
            ListNode prev = head;
            ListNode forward = head;
            forward = head.next;
            head = head.next;
            prev.next = null;
            while(head.next!=null){
                forward = head.next;
                head.next = prev;
                prev = head;
                head = forward;
                
            }
            head.next = prev;
            return head;
        }
    }
}