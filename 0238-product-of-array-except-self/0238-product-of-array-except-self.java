class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int count=0;
        int [] ans=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
            product*=nums[i];
            }else{
                count++;
            }
        }for(int i=0; i<nums.length; i++){
            if(count>=2){
                ans[i]=0;
            }else if(count==1){
                if(nums[i]==0){
                    ans[i]=product;
                }else{
                    ans[i]=0;
                }
            }else{
                ans[i]=product/nums[i];
            }
        }return ans;
    }
}