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
    public int pairSum(ListNode head) {
        if(head.next.next==null){
            return head.val+head.next.val;
        }
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        int counter = list.size()-1;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<(list.size()/2);i++){
            int temp = list.get(i)+list.get(counter);
            counter--;
            max = Math.max(temp,max);
        }
        return max;
    }
}