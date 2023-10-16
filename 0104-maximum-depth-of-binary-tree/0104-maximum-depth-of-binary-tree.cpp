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

    int max = 0;

    int maxDepth(TreeNode* root) {
        inorder(root,0);
        return max;
    }

    void inorder(TreeNode* root, int depth){
        if(root==nullptr){
            if(depth>max){
                max = depth;
            }
            return;
        }
        depth++;
        inorder(root->left,depth);
        inorder(root->right,depth);
    }
};