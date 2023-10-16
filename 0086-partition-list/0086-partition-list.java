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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){
            return head;
        }
        List<ListNode> order = new ArrayList<>();
        ListNode holder = head;
        while(head!=null){
            if(head.val<x){
                order.add(head);
            }
            head  =head.next;
        }
        head = holder;
        while(head!=null){
            if(head.val>=x){
                order.add(head);
            }
            head = head.next;
        }
        
        ListNode end = null;
        for(int i =0 ;i<order.size()-1;i++){
           ListNode temp = order.get(i);
           ListNode temp1 = order.get(i+1);
           temp.next = temp1;
           end = temp1;
        }
        end.next = null;

        return order.get(0);
    }
}