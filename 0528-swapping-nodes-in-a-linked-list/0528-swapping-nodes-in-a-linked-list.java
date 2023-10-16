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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode holder = head;
        int length =0;
        int s1 = 0;
        int s2 = 0;
        int counter = 0;
        while(head!=null){
            if(counter==k-1){
                s1 = head.val;
            }
            length++;
            head = head.next;
            counter++;
        }
        head = holder;
        int temp = 0;
        counter=0;
        while(counter!=length-k){
            head = head.next;
            counter++;
        }
        s2 = head.val;
        head = holder;
        counter = 0;
        while(head!=null){
            if(counter ==k-1){
                head.val = s2;
            }
            if(counter==length-k){
                head.val = s1;
            }
            head = head.next;
            counter++;
        }
        return holder;
    }
}