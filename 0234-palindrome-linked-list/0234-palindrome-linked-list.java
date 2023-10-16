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
    private static ListNode reverse(ListNode ye){
        ListNode curr = ye;
        ListNode prev = null;
        ListNode next= null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            //System.out.println(prev.val);
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode hold = head;
        ListNode ye = new ListNode(head.val);
        ListNode hello = ye;
        //System.out.println(ye.val);
        head = head.next;
        while(head!=null){
            ListNode temp = new ListNode(head.val);
            ye.next = temp;
            head = head.next;
            ye = ye.next;
            //System.out.println(ye.val);
        }
        ye = hello;
        head = hold;
        ListNode hi = reverse(head);
        while(hi!=null){
            //System.out.println(hi.val);
            //System.out.println(ye.val);
            if(hi.val!=ye.val){
                return false;
            }
            hi = hi.next;
            ye = ye.next;
        }
        return true;
    }
}