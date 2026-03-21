class Solution {
    Set<List<Integer>> set=new HashSet<>();
    List<Integer>li=new ArrayList<>();
    void fn(int [] nums , int i,List<Integer>li){
        if(i==nums.length){
            set.add( new ArrayList<>(li));
            return;
        }
        li.add(nums[i]);
        fn(nums,i+1,li);
        li.remove(li.size()-1);

        fn(nums,i+1,li);
    }
   
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        fn(nums,0,li);
        
        return new ArrayList<>(set);
        
    }
}