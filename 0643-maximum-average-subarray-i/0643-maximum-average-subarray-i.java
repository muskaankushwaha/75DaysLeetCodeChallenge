class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum=Integer.MIN_VALUE;
        int l=0;
        int r=k-1;
        double sum=0;
        for(int i=l; i<=r; i++){
            sum+=nums[i];
           maxSum=sum;
        }while(r<nums.length-1){
            sum=sum-nums[l];
            l++;
            r++;
            sum=sum+nums[r];
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum/k;
    }
}