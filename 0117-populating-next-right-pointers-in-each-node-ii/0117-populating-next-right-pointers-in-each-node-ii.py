"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""

class Solution:
    def connect(self, root: 'Node') -> 'Node':
        queue = [[root,0]]
        curr_row = []
        lvl = 0
        while queue:
            n = queue.pop(0)
            curr_node = n[0]
            curr_lvl = n[1]
            if curr_node is not None:
                if curr_lvl == lvl:
                    curr_row.append(curr_node)
                else:
                    lvl += 1
                    for i in range(len(curr_row)-1):
                        curr_row[i].next = curr_row[i+1]
                    curr_row = [curr_node]
                queue.append([curr_node.left,curr_lvl+1])
                queue.append([curr_node.right,curr_lvl+1])
        if curr_row:
            for i in range(len(curr_row)-1):
                curr_row[i].next = curr_row[i+1]
        return root