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
    public void reorderList(ListNode head) {
        List<ListNode> data = new ArrayList<>();
        while(head!=null){
            data.add(head);
            head = head.next;
        }
        int counter = 0;
        int pL = 0;
        int pR = data.size()-1;
        while(pL<pR){
            ListNode temp1 = data.get(pL);
            ListNode temp2 = data.get(pR);
            if(counter%2==0){
                temp1.next = temp2;
                pL++;
            }else{
                temp2.next = temp1;
                pR--;
            }
            counter++;
        }
        data.get(data.size()/2).next = null;
        head = data.get(0);
    }
}