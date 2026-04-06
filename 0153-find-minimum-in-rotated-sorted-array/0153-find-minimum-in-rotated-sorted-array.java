class Solution {
    
    public int findMin(int[] nums) {
        PriorityQueue<Integer> minheap= new PriorityQueue<>();
    for(int i=0; i<nums.length; i++){
        minheap.add(nums[i]);
    }return minheap.poll();
    }
}