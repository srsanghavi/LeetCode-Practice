// https://leetcode.com/problems/search-insert-position/description/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        for( i=0;i<nums.length&&nums[i]<target;i++);
        return i;
    }
}