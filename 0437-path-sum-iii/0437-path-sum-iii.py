class Node:
    def __init__(self, val, prev):
        self.val = val
        self.prev = prev

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> int:
        ml = [0]
        self.ts = targetSum
        self.dfs(root,ml,None)
        return ml[0]

    def dfs(self, root, ml, prev):
        if root is None:
            return
        curr = Node(root.val, prev)
        head = curr
        sum = 0
        while head != None:
            sum += head.val
            if sum == self.ts:
                ml[0] += 1
            head = head.prev
        self.dfs(root.right, ml, curr)
        self.dfs(root.left, ml, curr)