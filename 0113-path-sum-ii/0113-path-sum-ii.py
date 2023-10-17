class MyNode:
    def __init__(self, treenode, prev):
        self.val = treenode
        self.prev = prev


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
        self.dfs(root,master_list,None,0)
        return master_list
    
    def dfs(self, root, master_list, prev, sum):
        if root is None:
            return
        curr = MyNode(root.val, prev)
        sum += root.val
        if root.right is None and root.left is None:
            if sum == self.ts:
                row = []
                head = curr
                while head is not None:
                    row.insert(0,head.val)
                    head = head.prev
                master_list.append(row)
            return
        self.dfs(root.right, master_list, curr, sum)
        self.dfs(root.left, master_list, curr, sum)