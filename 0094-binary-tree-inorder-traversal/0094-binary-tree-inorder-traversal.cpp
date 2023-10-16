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


    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> inorder;
        doItInOrder(inorder,root);
        return inorder;
    }

    void doItInOrder(vector<int>& inorder, TreeNode* root){
        if(root==nullptr){
            return;
        }
        doItInOrder(inorder,root->left);
        inorder.emplace_back(root->val);
        doItInOrder(inorder,root->right);
    }
};