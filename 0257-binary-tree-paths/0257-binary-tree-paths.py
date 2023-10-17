# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        master_list = []
        self.dfs(root,"",master_list)
        return master_list

    def dfs(self, root, path, master_list):
        if root is None:
            return None
        if path == "":
            path += str(root.val)
        else:
            path += "->"+str(root.val)
        if root.left is None and root.right is None:
            master_list.append(path)
            return None
        self.dfs(root.right,path,master_list)
        self.dfs(root.left,path,master_list)
        