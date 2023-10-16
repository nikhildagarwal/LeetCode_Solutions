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
    int maxR = 0;
    int maxL = 0;
    bool fin = true;
    
    bool isBalanced(TreeNode* root) {
        traverse(root);
        return fin;
    }

    void traverse(TreeNode* root){
        if(root==nullptr){
            return;
        }
        maxL = 0;
        maxR = 0;
        depthCalc(root->right,1,0);
        depthCalc(root->left,-1,0);
        if(abs(maxL-maxR) > 1){
            fin = false;
        }
        traverse(root->left);
        traverse(root->right);
    }

    void depthCalc(TreeNode* root, int direction,int depth){
        if(root==nullptr){
            if(direction == 1){
                if(depth>maxR){
                    maxR = depth;
                }
            }else{
                if(depth>maxL){
                    maxL = depth;
                }
            }
            return;
        }
        depth++;
        depthCalc(root->left,direction,depth);
        depthCalc(root->right,direction,depth);
    }

};