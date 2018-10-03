# https://leetcode.com/problems/array-partition-i/description/

class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        sort = sorted(nums)
        s = sum(sort[::2])
        return s
