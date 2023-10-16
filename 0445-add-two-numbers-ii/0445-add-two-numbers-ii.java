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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<ListNode> firstNum = new ArrayList<>();
        List<ListNode> secondNum = new ArrayList<>();
        while(l1!=null){
            firstNum.add(l1);
            l1 = l1.next;
        }
        while(l2!=null){
            secondNum.add(l2);
            l2 = l2.next;
        }
        if(firstNum.size()<secondNum.size()){
            while(firstNum.size()!=secondNum.size()){
                ListNode hi = new ListNode(0);
                firstNum.add(0,hi);
            }
        }
        if(secondNum.size()<firstNum.size()){
            while(firstNum.size()!=secondNum.size()){
                secondNum.add(0,new ListNode(0));
            }
        }
        int carry =0;
        for(int i = secondNum.size()-1;i>=0;i--){
            secondNum.get(i).val = secondNum.get(i).val+firstNum.get(i).val+carry;
            if(secondNum.get(i).val>=10){
                carry = 1;
                secondNum.get(i).val=secondNum.get(i).val%10;
            }else{
                carry = 0;
            }
        }
        if(carry ==1){
            secondNum.add(0,new ListNode(1));
        }
        for(int i = 0;i<secondNum.size()-1;i++){
            ListNode temp1 = secondNum.get(i);
            ListNode temp2 = secondNum.get(i+1);
            temp1.next = temp2;
        }
        return secondNum.get(0);
    }
}