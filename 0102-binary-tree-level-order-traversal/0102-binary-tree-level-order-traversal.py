class Node:
    def __init__(self, tn, lvl):
        self.tnode = tn
        self.level = lvl


# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        queue = [Node(root,0)]
        ml = []
        curr_row = []
        lvl = 0
        while queue:
            n = queue.pop(0)
            curr_lvl = n.level
            curr_node = n.tnode
            if curr_node is not None:
                if curr_lvl == lvl:
                    curr_row.append(curr_node.val)
                else:
                    lvl += 1
                    ml.append(curr_row)
                    curr_row = [curr_node.val]
                queue.append(Node(curr_node.left,curr_lvl+1))
                queue.append(Node(curr_node.right,curr_lvl+1))
        if curr_row:
            ml.append(curr_row)
        return ml