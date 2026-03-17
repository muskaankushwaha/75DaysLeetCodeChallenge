class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //solved using hashmap and min heap 
        //frequency map
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        //minheap based frequency
        PriorityQueue<int[]>minh=new PriorityQueue<>((a,b)->a[1]-b[1]);
        //add(value,freq)into heap
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
minh.add(new int[]{entry.getKey(),entry.getValue()});
if(minh.size()>k){
    minh.poll();//remove lowest freq 
}
        }
        int[] ans=new int[k];
        for(int i=0; i<k; i++){
            ans[i]=minh.poll()[0];
        }
        return ans;
    }
}