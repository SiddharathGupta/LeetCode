class Solution:
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        odd, even = 0, 0
        n = len(nums)
        for idx, val in enumerate(nums):
            if(idx % 2 == 0):
                even = max(even+val, odd)
            else:
                odd = max(odd+val, even)
        return max(even, odd)

