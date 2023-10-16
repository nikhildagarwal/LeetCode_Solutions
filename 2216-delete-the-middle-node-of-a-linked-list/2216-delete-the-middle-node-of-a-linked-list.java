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
    public ListNode deleteMiddle(ListNode head) {
        int length = 0;
        ListNode holder = head;
        while(head!=null){
            length++;
            head = head.next;
        }
        head = holder;
        if(length == 1){
            return null;
        }else if(length==2){
            head.next=null;
            return head;
        }else{
            for(int i = 0;i<length/2;i++){
                head = head.next;
            }
            //ListNode secondHalf = head.next;
            ListNode middle = head;
            head = holder;
            int signal = -1;
            while(signal<0){
                if(head.next!=middle){
                    head = head.next;
                }else{
                    signal = 1;
                    head.next = middle.next;
                }
            }
            head = holder;
            return head;
        }
        
        
    }
}