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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null || right==left){
            return head;
        }else{
            List<ListNode> build1 = new ArrayList<>();
            List<ListNode> build2 = new ArrayList<>();
            List<ListNode> build3 = new ArrayList<>();

            int counter = 1;
            ListNode holder = head;
            while(head!=null && counter<left){
                build1.add(head);
                head = head.next;
                counter++;
            }
            while(head!=null&&counter<=right){
                build2.add(head);
                head = head.next;
                counter++;
            }
            while(head!=null){
                build3.add(head);
                head = head.next;
            }
            int s1 = build1.size();
            int s2 = build2.size();
            int s3 = build3.size();
            head = holder;
            if(s1==0 && s3 ==0){
                ListNode prev = head;
                ListNode forward = head;
                forward = head.next;
                head = head.next;
                prev.next = null;
                while(head.next!=null){
                    forward = head.next;
                    head.next = prev;
                    prev = head;
                    head = forward;
                }
                head.next = prev;
                return head;
            }else if(s1==0 && s3!= 0){
                ListNode midHold = build2.get(s2-1);
                for(int i = s2-1;i>0;i--){
                    ListNode temp1 = build2.get(i);
                    ListNode temp2 = build2.get(i-1);
                    temp1.next = temp2;
                }
                ListNode hi = build2.get(0);
                hi.next = build3.get(0);
                return midHold;
            }else if(s1!=0 && s3== 0){
                ListNode start = build1.get(0);
                ListNode end = build1.get(s1-1);
                ListNode midHold = build2.get(s2-1);
                for(int i = s2-1;i>0;i--){
                    ListNode temp1 = build2.get(i);
                    ListNode temp2 = build2.get(i-1);
                    temp1.next = temp2;
                }
                ListNode hi = build2.get(0);
                hi.next = null;
                end.next = midHold;
                return start;
            }else{
                ListNode start1 = build1.get(0);
                ListNode end1 = build1.get(s1-1);
                ListNode start2 = build3.get(0);
                ListNode end2 = build3.get(s3-1);
                end2.next=null;
                ListNode midHold = build2.get(s2-1);
                for(int i = s2-1;i>0;i--){
                    ListNode temp1 = build2.get(i);
                    ListNode temp2 = build2.get(i-1);
                    temp1.next = temp2;
                }
                ListNode hi = build2.get(0);
                hi.next = start2;
                end1.next = midHold;
                return start1;
            }
            
        }
    }
}