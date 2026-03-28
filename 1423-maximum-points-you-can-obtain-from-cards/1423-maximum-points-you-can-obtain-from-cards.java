class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=k-1;
        int r=cardPoints.length-1;
        int sum=0;
        int maxSum=0;
        for(int i=0; i<k; i++){
            sum+=cardPoints[i];
        }
        maxSum=sum;
        while(l>=0){
            sum=sum-cardPoints[l];
            sum=sum+cardPoints[r];
            l--;
            r--;
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
}