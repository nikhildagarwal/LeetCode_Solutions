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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }else{
            ListNode holder = head;
            ListNode first = head;
            int temp = first.val;
            while(head.next!=null){
                head = head.next;
                if(temp == head.val){
                    if(head.next==null){
                        first.next = null;
                    }
                }else{
                    first.next = head;

                    first = head;
                    temp = head.val;
                }
            }
            head = holder;
            return head;
        }
    }
}