# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> List[List[int]]:
        master_list = []
        self.ts = targetSum
        self.dfs(root,master_list,"",0)
        return master_list
    
    def dfs(self, root, master_list, path, sum):
        if root is None:
            return
        if path == "":
            path += str(root.val)
        else:
            path += ":"+str(root.val)
        sum += root.val
        if root.right is None and root.left is None:
            if sum == self.ts:
                string_list = path.split(":")
                master_list.append([int(x) for x in string_list])
            return
        self.dfs(root.right, master_list, path, sum)
        self.dfs(root.left, master_list, path, sum)