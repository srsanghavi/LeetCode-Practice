// https://leetcode.com/problems/move-zeroes/description/

class Solution {
    public void moveZeroes(int[] nums) {
        int last = nums.length - 1;
        int temp;
        for(int i = nums.length-1;i>=0;i--){
            if(nums[i]==0){
                temp = nums[i];
                for(int j = i;j<=last-1;j++){
                    nums[j] = nums[j+1];
                }
                nums[last] = temp;
                last --;
            }
        }
    }
}
