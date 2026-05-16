class Solution {
    void fn(int[]nums, boolean[]flag,List<Integer>ds, List<List<Integer>>ans){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0; i<nums.length; i++){
          if(i > 0 && nums[i] == nums[i-1] && !flag[i-1]) continue;
            if(!flag[i]){
                ds.add(nums[i]);
                flag[i]=true;
                fn(nums,flag,ds,ans);
                ds.remove(ds.size()-1);
                flag[i]=false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean [] flag =new boolean[nums.length];
        List<List<Integer>> ans=new ArrayList<>();
        fn(nums,flag,new ArrayList<>(),ans);
        return ans;
    }
}