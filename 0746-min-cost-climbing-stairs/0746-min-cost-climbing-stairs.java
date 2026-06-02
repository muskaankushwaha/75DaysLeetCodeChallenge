class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // int [] dp=new int [n+2];
        int prev=0;
        int prev2=0;
        for(int i=n-1; i>=0; i--){
        //  dp[i] = cost[i] + Math.min(dp[i+1], dp[i+2]);
        int curr=cost[i]+Math.min(prev,prev2);
        prev2=prev;
        prev=curr;
        }return Math.min(prev,prev2);
    }
}