class Solution:
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        str = str.strip()
        if len(str) == 0:
            return 0
        sign, result = 1, 0
        # str = str.strip()
        if str[0] == "-":
            sign = -1
        if str[0] == "+" or str[0] == "-":
            str = str[1:]
        for idx, val in enumerate(str):
            if idx == 0 and not val.isdigit():
                return 0
            elif val.isdigit():
                result = result * 10 + int(val)
            else:
                break
        result = result * sign
        if sign == 1:
            result = min(result, pow(2, 31)-1)
        else:
            result = max(result, -1*pow(2, 31))
        return result
