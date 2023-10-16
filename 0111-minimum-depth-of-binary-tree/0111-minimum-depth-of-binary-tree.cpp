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

    int minDepthHold = INT_MAX;

    int minDepth(TreeNode* root) {
        if(root == nullptr){
            return 0;
        }
        traverse(root,0);
        return minDepthHold;
    }

    void traverse(TreeNode* root,int depth){
        if(root == nullptr){
            return;
        }
        depth++;
        if((root->left == nullptr) && (root->right == nullptr)){
            if(depth<minDepthHold){
                minDepthHold = depth;
            }
        }
        traverse(root->left,depth);
        traverse(root->right,depth);
    }
};