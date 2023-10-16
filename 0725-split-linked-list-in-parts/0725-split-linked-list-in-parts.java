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
    public ListNode[] splitListToParts(ListNode head, int k) {
        List<ListNode> data = new ArrayList<>();
        int length = 0;
        
        while(head!=null){
            data.add(head);
            head = head.next;
            length++;
        }
        int rem =length%k;
        int itemsInSinglePart = length/k;
        ListNode[] res = new ListNode[k];
        List<Integer> passes = new ArrayList<>();
        for(int i = 0;i<k;i++){
            if(rem>0){
                passes.add(itemsInSinglePart+1);
                rem--;
            }else{
                passes.add(itemsInSinglePart);
            }
        }
        passes.add(0,0);
        int first = 0;
        int second = 0;
        for(int i = 0;i<k;i++){
            if(passes.get(i+1)==0){
                i = k;
            }else{
                first+=passes.get(i);
            second+=passes.get(i+1);
            ListNode start = data.get(first);
            ListNode end = data.get(second-1);
            end.next=null;
            res[i] = start;
            }
            
        }
        return res;
    }
}