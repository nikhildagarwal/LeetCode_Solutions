/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
        vector<int> pvalues;
        vector<int> pdirect;
        inorder(p,pvalues,pdirect,0);

        vector<int> qvalues;
        vector<int> qdirect;
        inorder(q,qvalues,qdirect,0);

        return (pvalues==qvalues) && (pdirect==qdirect);
    }

    void inorder(TreeNode* root, vector<int>& nums, vector<int>& direct, int direction){
        if(root==nullptr){
            return;
        }
        inorder(root->left,nums,direct,-1);
        nums.emplace_back(root->val);
        direct.emplace_back(direction);
        inorder(root->right,nums,direct,1);
    }
};