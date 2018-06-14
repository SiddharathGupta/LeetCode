class Solution:
    def numTrees(self, n):
        """
        :type n: int
        :rtype: int
        """
        res = 1.0
        for i in range(2, n+1):
            res = res * (n+i)/i
        return int(round(res))
