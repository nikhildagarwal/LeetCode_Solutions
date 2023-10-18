# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrderBottom(self, root: Optional[TreeNode]) -> List[List[int]]:
        queue = [[root,0]]
        ml = []
        curr_row = []
        lvl = 0
        while queue:
            n = queue.pop(0)
            curr_lvl = n[1]
            curr_node = n[0]
            if curr_node is not None:
                if curr_lvl == lvl:
                    curr_row.append(curr_node.val)
                else:
                    lvl += 1
                    ml.insert(0,curr_row)
                    curr_row = [curr_node.val]
                queue.append([curr_node.left,curr_lvl+1])
                queue.append([curr_node.right,curr_lvl+1])
        if curr_row:
            ml.insert(0,curr_row)
        return ml