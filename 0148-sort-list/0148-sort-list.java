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
    public ListNode sortList(ListNode head) {
        ListNode start = head;
        ListNode holder = head;
        List<Integer> data = new ArrayList<>();
        while(head!=null){
            data.add(head.val);
            head = head.next;
        }
        Collections.sort(data);
        for(int i = 0;i<data.size();i++){
            holder.val = data.get(i);
            holder = holder.next;
        }
        return start;
    }
}