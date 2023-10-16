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
    vector<int> postorderTraversal(TreeNode* root) {
        vector<int> myVector;
        traverse(root,myVector);
        return myVector;
    }

    void traverse(TreeNode* root, vector<int>& myVector){
        if(root==nullptr){
            return;
        }
        if(root->left == nullptr && root->right == nullptr){
            myVector.emplace_back(root->val);
            return;
        }
        traverse(root->left,myVector);
        traverse(root->right,myVector);
        myVector.emplace_back(root->val);
    }
};