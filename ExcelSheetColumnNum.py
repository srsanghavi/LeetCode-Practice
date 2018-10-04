// https://leetcode.com/problems/excel-sheet-column-number/description/

class Solution(object):
    def titleToNumber(self, s):
        """
        :type s: str
        :rtype: int
        """
        d = {}
        for i in range(1,27):
            d[i] = i
        value = 0;
        for c in s:
            value = value * 26 + d[ord(c) - ord('A')+1]
        return value
        
