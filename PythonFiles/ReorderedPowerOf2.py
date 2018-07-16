class Solution(object):
    def reorderedPowerOf2(self, n):
        """
        :type N: int
        :rtype: bool
        """
        count = collections.Counter(str(n))
        return any(count == collections.Counter(str(1 << b)) for b in xrange(31))

