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
    private static int power2 (int a){
        if(a==0){
            return 1;
        }else{
            return 2*power2(a-1);
        }
    }

    public int getDecimalValue(ListNode head) {
        ListNode holder = head;
        int result = 0;
        int counter = -1;
        while(head!=null){
            counter++;
            head = head.next;
        }
        head = holder;
        while(head!=null){
            int temp = head.val*power2(counter);
            result = result + temp;
            counter--;
            head = head.next;
            
        }
        return result;
    }
}