class Solution(object):
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        if n == 1:
            return "1"
        result = self.countAndSay(n-1)
        current = result[0]
        ans = ""
        count = 0
        for val in result:
            if val == current:
                count += 1
            else:
                ans += str(count) + current
                current = val
                count = 1
        ans += str(count) + current
        return ans
