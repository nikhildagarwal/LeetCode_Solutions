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
    public ListNode swapPairs(ListNode head) {
        ListNode hold = head;
        ListNode last = null;
        int length = 0;
        while(head!=null){
            length++;
            if(head.next==null){
                last = head;
            }
            head = head.next;
        }
        head = hold;
        //System.out.println("Last: "+last.val);
        //System.out.println(length);
        if(head==null){
            return null;
        }else if(length ==1){
            return head;
        }else if(length==2){
            ListNode init = head.next;
            ListNode start = head.next;
            ListNode end = head;
            start.next = end;
            end.next = null;
            return init;
        }else{
            if(length%2==0){
                
                //System.out.println(start.val);
                ListNode initial = head.next;
                ListNode pickup = null;
                for(int i=0;i<length/2-1;i++){
                    ListNode start=head.next;
                    ListNode mid = head;
                    ListNode end = head.next.next.next;
                    ListNode newMid = head.next.next;
                    start.next = mid;
                    mid.next = end;
                    start = end;
                    pickup = start;
                    head = newMid;
                }
                pickup.next = head;
                head.next = null;
                head = initial;
                return head;
                
            }else{
                if(length==3){
                    ListNode init = head.next;
                    ListNode start = head.next;
                    ListNode mid = head;
                    ListNode end = head.next.next;
                    start.next = mid;
                    mid.next = end;
                    end.next = null;
                    head = init;
                    return head;
                }else{
                    ListNode initial = head.next;
                ListNode pickup = null;
                for(int i=0;i<length/2-1;i++){
                    ListNode start=head.next;
                    ListNode mid = head;
                    ListNode end = head.next.next.next;
                    ListNode newMid = head.next.next;
                    start.next = mid;
                    mid.next = end;
                    start = end;
                    pickup = start;
                    head = newMid;
                }
                pickup.next = head;
                head.next = last;
                //System.out.println(head.next.val);
                last.next = null;
                head = initial;
                return head;
                }
            }
        }
        
    }
}