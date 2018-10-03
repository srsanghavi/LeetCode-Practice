// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int val;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            val = Math.abs(nums[i]);
            nums[val - 1] = Math.abs(nums[val - 1])*-1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res.add(i+1);
            }
        }
        return res;
    }
}
