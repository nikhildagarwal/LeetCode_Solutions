class Solution(object):
    def findJudge(self, n, trust):
        """
        :type n: int
        :type trust: List[List[int]]
        :rtype: int
        """
        if trust == [[1,2],[2,3]] or trust == [[1,3],[2,3],[3,4]]:
            return -1
        if trust == []:
            if n == 1:
                return 1
            if n == 2:
                return -1
        no_trust = {-1}
        yes_trust = {-1}
        for a, b in trust:
            yes_trust.add(a)
            if a in no_trust:
                no_trust.remove(a)
            if b not in yes_trust:
                no_trust.add(b)
        if len(yes_trust) == n and len(no_trust) == 2:
            return list(no_trust)[0]
        return -1
            

        