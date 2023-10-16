/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        if(head == nullptr){
            return head;
        }
        if(head->next == nullptr){
            return head;
        }
        int currVal = head->val;
        ListNode* start = head;
        ListNode* holder = head;
        start = start->next;
        while(start!=nullptr){
            if(start->val == currVal){
                start = start->next;
            }else{
                holder->next = start;
                holder = start;
                currVal = start->val;
                start = start->next;
            }
        }
        holder ->next = nullptr;
        return head;
    }
};