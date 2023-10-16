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
    public int[] nextLargerNodes(ListNode head) {
        ListNode holder = head;
        int count = 0;
        while(holder!=null){
            count++;
            holder = holder.next;
        }
        int[] res = new int[count];
        ListNode i = head;
        count = 0;
        while(i!=null){
            ListNode temp = i;
            if(temp.next!=null){
                temp = temp.next;
                while(temp!=null && temp.val<=i.val){
                    temp = temp.next;
                }
                if(temp!=null){
                    res[count] = temp.val;
                }
            }
            i = i.next;
            count++;
        }
        return res;
    }
}