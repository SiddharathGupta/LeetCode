class Solution:
    def primePalindrome(self, n):
        """
        :type N: int
        :rtype: int
        """
        if 8 <= n <= 11: return 11
        for x in range(10 ** int(len(str(n)) / 2), 10**5):
            y = int(str(x)+str(x)[-2::-1])
            if y >= n and self.is_prime(y): return y
    def is_prime(self, x):
        if x < 2 or x % 2 == 0: return x == 2
        for i in range(3, int(x**0.5)+1, 2):
            if x % i == 0: return False
        return True
