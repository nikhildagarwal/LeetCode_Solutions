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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode hold = head;
        int length =0;
        while(hold.next!=null){
            length++;
            hold = hold.next;
        }
        length++;
        
        if(length%k==0){
            ListNode temp = new ListNode(-1);
            hold.next = temp;
            temp.next = null;
        }
        List<ListNode> data = new ArrayList<>();
        Stack<ListNode> data1 = new Stack<>();
        Stack<ListNode> reverse = new Stack<>();
        int counter = 0;
        while(head!=null){
            if(counter<k){
                
                reverse.push(head);
                counter++;
                head = head.next;
                if(head==null){
                    while(!reverse.empty()){
                        data1.push(reverse.pop());
                    }
                }
            }else{
                counter=0;
                while(!reverse.empty()){
                    data.add(reverse.pop());
                }
            }
        }
        while(!data1.empty()){
            data.add(data1.pop());
        }
        for(int i = 0;i<data.size()-1;i++){
            ListNode temp1 = data.get(i);
            ListNode temp2 = data.get(i+1);
            temp1.next = temp2;
        }
        if(length%k==0){
            data.get(data.size()-2).next =null;
        }else{
            data.get(data.size()-1).next =null;
        }
        
        return data.get(0);
    }
}