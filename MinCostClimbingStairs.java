// https://leetcode.com/problems/min-cost-climbing-stairs/description/

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 0) return 0;
        if(cost.length == 1) return cost[0];
        int[] d = new int[cost.length];
        d[0] = cost[0];
        d[1] = Math.min(cost[0]+cost[1],cost[1]);
        for(int i=2;i<cost.length;i++){
            d[i] = Math.min(d[i-2]+cost[i],d[i-1]+cost[i]);
        }
        return Math.min(d[cost.length-1],d[cost.length-2]);
    }
}
