class Solution(object):
    def binaryGap(self, N):
        """
        :type N: int
        :rtype: int
        """
        last, ans = -1, 0
        for i in xrange(32):
            if (N>>i)&1 != 0:
                if last >= 0:
                    ans = max(ans, i-last)
                last = i
        return ans
