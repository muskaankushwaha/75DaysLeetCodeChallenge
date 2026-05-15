class Solution {
    void fn(int ind , int[]arr, int target, int k, List<Integer>ds , List<List<Integer>>ans){
        if(ds.size()==k){
        if(target==0){
            ans.add(new ArrayList<>(ds));
        }
            return;
        }for(int i=ind; i<arr.length; i++){
            if(i>ind && arr[i]==arr[i-1])continue;
            if(arr[i]>target)break;
            ds.add(arr[i]);
            fn(i+1,arr,target-arr[i], k,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans=new ArrayList<>();
        fn(0,arr,n,k,new ArrayList<>(),ans);
        return ans;
    }
}