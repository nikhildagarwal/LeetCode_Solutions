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
    

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode hold2 = l2;
        ListNode hold1 = l1;
        ListNode prev1 = null;
        while(l1!=null && l2!=null){
            l1.val = l1.val+l2.val;
            prev1 = l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1==null && l2!=null){
            prev1.next = l2;
        }
        l1 = hold1;
        int carryOver = 0;
        while(l1!=null){
            l1.val = l1.val+carryOver;
            if(l1.val>9){
                carryOver = 1;
                l1.val = l1.val%10;
            }else{
                carryOver = 0;
            }
            prev1 = l1;
            l1 = l1.next;
        }
        if(carryOver==1){
            prev1.next = new ListNode(1);
        }
        return hold1;
    }
}