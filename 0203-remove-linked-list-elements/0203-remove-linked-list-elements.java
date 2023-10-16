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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }else{
            ListNode holder = head;
            while( head!=null &&head.val==val){
                holder = holder.next;
                head = head.next;
            }
            if(head==null || head.next==null){
                return head;
            }else{
                ListNode prev = holder;
            head = head.next;
            while(head!=null){
                if(head.val == val){
                    int signal = -1;
                    while( signal<0 && head.next!=null){
                        if(head.next.val==val){
                            head = head.next;
                        }else{
                            signal = 1;
                        }
                        
                    }
                    prev.next = head.next;
                    head = prev.next;
                    
                }else{
                    prev = head;
                    head = head.next;
                }
            }
            
            return holder;
            }
            
        }
    }
}