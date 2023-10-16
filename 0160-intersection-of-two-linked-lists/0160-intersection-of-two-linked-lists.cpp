/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        set<ListNode*> mySet;
        while(headA != nullptr){
            mySet.insert(headA);
            headA = headA->next;
        }
        while(headB != nullptr){
            if(mySet.count(headB) > 0){
                return headB;
            }
            headB = headB->next;
        }
        return nullptr;
    }
};