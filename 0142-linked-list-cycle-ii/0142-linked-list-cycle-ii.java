/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> data = new HashSet<>();
        while(head!=null){
            if(data.contains(head)) return head;
            data.add(head);
            head = head.next;
        }
        return null;
    }
}