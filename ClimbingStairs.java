// https://leetcode.com/problems/climbing-stairs/description/

class Solution {
    public int climbStairs(int n) {
        if(n==0) return 1;
        if(n==1) return 1;
        int[] d = new int[n+1];
        d[0] = 1;
        d[1] = 1;
        for(int i=2;i<=n;i++){
            d[i] = d[i-1]+d[i-2];
        }
        return d[n];
    }
}
