class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int x_minus_y=0;
        int x2_minus_y2=0;
        for(int i=0; i<n; i++){
           x_minus_y+=nums[i]-(i+1);
           x2_minus_y2+=(nums[i]*nums[i])-(i+1)*(i+1);
        }
        int x=((x_minus_y)+(x2_minus_y2)/(x_minus_y))/2;
        int y=x-(x_minus_y);
        int [] ans={x,y};
        return ans;
    }
}