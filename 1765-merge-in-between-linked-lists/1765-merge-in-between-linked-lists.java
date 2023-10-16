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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode holder = list1;
        int counter = 0;
        ListNode midS = null;
        ListNode endS = null;
        while(list1!=null){
            if(counter+1 == a){
                midS = list1;
            }
            if(counter-1==b){
                endS = list1;
            }
            list1 = list1.next;
            counter++;
            
        }
        midS.next = list2;
        while(list2.next!=null){
            list2 = list2.next;
        }
        list2.next = endS;
        return holder;
    }
}