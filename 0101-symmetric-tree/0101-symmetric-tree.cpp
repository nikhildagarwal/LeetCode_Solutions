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

    int LEFT_SIDE = 0;
    int RIGHT_SIDE = 1;
    int CENTER = 0;
    int LEFT = -1;
    int RIGHT = 1;

    bool isSymmetric(TreeNode* root) {
        vector<int> leftValues;
        vector<int> leftDirect;
        vector<int> rightValues;
        vector<int> rightDirect;
        inorder(root->left,leftValues,leftDirect,CENTER,LEFT_SIDE);
        inorder(root->right,rightValues,rightDirect,CENTER,RIGHT_SIDE);
        return leftValues == rightValues && leftDirect==rightDirect;
    }

    void inorder(TreeNode* root,vector<int>& values, vector<int>& direct, int direction, int side){
        if(root==nullptr){
            return;
        }
        if(side==LEFT_SIDE){
inorder(root->left,values,direct,LEFT,side);
        values.emplace_back(root->val);
        values.emplace_back(direction);
        inorder(root->right,values,direct,RIGHT,side);
        }else{
inorder(root->right,values,direct,LEFT,side);
        values.emplace_back(root->val);
        values.emplace_back(direction);
        inorder(root->left,values,direct,RIGHT,side);
        }
    }
};