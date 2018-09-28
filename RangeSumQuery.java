// https://leetcode.com/problems/range-sum-query-immutable/description/

class NumArray {
    private int[] sum;
    private int[] nums;
    public NumArray(int[] nums) {
        if(nums.length==0){
            return;
        }
        this.nums = nums;
        sum = new int[nums.length];
        sum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i] = sum[i-1]+nums[i];
        }
    }
    
    public int sumRange(int i, int j) {
        return nums[i]+sum[j]-sum[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
