class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t) or len(set(s)) != len(set(t)):
            return False
        res = dict()
        for ele_a, ele_b in zip(s, t):
            if ele_a not in res:
                res[ele_a] = ele_b
            elif res[ele_a] != ele_b:
                return False
        return True
