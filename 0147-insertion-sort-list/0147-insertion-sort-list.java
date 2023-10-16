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
    public ListNode insertionSortList(ListNode head){
        List<Integer> data = new ArrayList<>();
        ListNode holder = head;
        while(holder!=null){
            data.add(holder.val);
            holder = holder.next;
        }
        Collections.sort(data);
        int count = 0;
        holder = head;
        while(head!=null){
            head.val = data.get(count);
            head = head.next;
            count++;
        }
        return holder;
    }
}