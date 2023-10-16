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

    bool fin = false;

    bool hasPathSum(TreeNode* root, int targetSum) {
        traverse(root,0,targetSum);
        return fin;
    }

    void traverse(TreeNode* root, int sum,int targetSum){
        if(root == nullptr){
            return;
        }
        sum += root->val;
        if((root->right == nullptr) && (root->left == nullptr)){
            if(sum == targetSum){
                fin = true;
            }
        }
        traverse(root->left,sum,targetSum);
        traverse(root->right,sum,targetSum);
    }
};