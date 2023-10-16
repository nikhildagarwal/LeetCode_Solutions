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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        if(lists.length==1){
            return lists[0];
        }
        List<ListNode> newL = new ArrayList<>();
        for(int i = 0;i<lists.length;i++){
            ListNode curr = lists[i];
            while(curr!=null){
                newL.add(curr);
                curr = curr.next;
            }
        }
        if(newL.size()==0) return null;
        ListNode[] hi = new ListNode[newL.size()];
        hi = newL.toArray(hi);
        Arrays.sort(hi, (a,b) -> Integer.compare(a.val,b.val));
        for(int i =0;i<hi.length-1;i++){
            hi[i].next = hi[i+1];
        }
        hi[hi.length-1].next=null;
        return hi[0];
    }
}