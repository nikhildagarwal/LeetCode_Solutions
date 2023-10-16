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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        HashMap<Integer,Integer> occ = new HashMap<>();
        ListNode holder = head;
        while(head!=null){
            int temp = head.val;
            occ.put(temp,occ.getOrDefault(temp,0)+1);
            head = head.next;
        }
        

        head = holder;
        List<ListNode> data = new ArrayList<>();
        while(head!=null){
            int temp = head.val;
            if(occ.get(temp)==1){
                data.add(head);
            }
            head = head.next;
        }
        if(data.size()==0){
            return null;
        }else{
            ListNode start = data.get(0);
        for(int i = 0;i<data.size()-1;i++){
            ListNode t1 = data.get(i);
            ListNode t2 = data.get(i+1);
            t1.next = t2;
        }
        data.get(data.size()-1).next = null;
        return start;
        }
        
    }
}