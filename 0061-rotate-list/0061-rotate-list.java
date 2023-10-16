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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }else{
            if(k==0){
            return head;
        }else{
            int length = 0;
            ListNode holder = head;
            while(head!=null){
                length++;
                head = head.next;
            }
            head = holder;
            //System.out.println(length);
            if(k>=length){
                k = k%length;
            }
            if(k==0){
                return head;
            }else{
                //System.out.println(k);
                ListNode first = head;
                ListNode temp = first;
                for(int i = 0;i<k;i++){
                    
                    while(head.next.next!=null){
                        head = head.next;
                    }
                    first = head.next;
                    first.next = temp;
                    head.next = null;
                    head = first;
                    temp = first;
                }
                return head;    
            }
            
        }
        }
        
    }
}