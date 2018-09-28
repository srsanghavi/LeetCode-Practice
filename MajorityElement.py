# https://leetcode.com/problems/majority-element/description/

class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        d = {}
        for i in nums:
            if i in d:
                d[i]+=1
            else:
                d[i]=1
        for key in d:
            if d[key] > len(nums)/2:
                return key
        
