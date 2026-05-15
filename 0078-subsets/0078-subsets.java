class Solution {
    void fn(int i, int []arr , List<Integer>ds , List<List<Integer>>ans){
        if(i==arr.length){
            ans.add(new ArrayList(ds));
            return;
        }
        ds.add(arr[i]);
        fn(i+1, arr, ds,ans);
        ds.remove(ds.size()-1);
        fn(i+1, arr,ds,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        fn(0,nums,new ArrayList<>() , ans);
        return ans;
    }
}