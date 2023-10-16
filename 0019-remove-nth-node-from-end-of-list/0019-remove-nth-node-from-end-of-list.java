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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode hold = head;
        int length = 0;
        while(head!=null){
            length++;
            head = head.next;
        }
        head = hold;
        //System.out.println(head.val);
        //System.out.println(length);
        if(n>length){
            return head;
        }else if(length==1 && n==1){
            return null;
        }else if(length == n){
            head = head.next;
            return head;
        }else{
            ListNode bridgeS = head;
            ListNode bridgeE = head;
            //System.out.println(bridgeE.val);
            //System.out.println(bridgeS.val);
            for(int i = 0;i<length-n-1;i++){
                bridgeS = bridgeS.next;
            }
            //System.out.println(bridgeS.val);
            bridgeE = bridgeS.next.next;
            bridgeS.next = bridgeE;
            return head;
        }
    }
}