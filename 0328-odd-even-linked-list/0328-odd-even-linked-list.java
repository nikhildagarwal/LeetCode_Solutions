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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }
        ListNode holder1 = head;
        ListNode holder2 = head.next;
        ListNode curr = head.next;
        while(curr.next!=null && curr.next.next!=null){
            head.next = head.next.next;
            head = head.next;
            curr.next = curr.next.next;
            curr = curr.next;
        }
        if(curr.next!=null){
            head.next = head.next.next;
            head = head.next;
            curr.next=null;
        }
        head.next = holder2;
        return holder1;
        
    }
}