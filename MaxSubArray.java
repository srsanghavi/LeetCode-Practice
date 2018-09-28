// https://leetcode.com/problems/maximum-subarray/description/

class Solution {
    public int maxSubArray(int[] nums) {
        int maxHere=nums[0], max = maxHere;
        for(int i=1;i<nums.length;i++){
            maxHere = Math.max(nums[i]+maxHere,nums[i]);
            max = Math.max(max,maxHere);
        }
        return max;
    }
}
