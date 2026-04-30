class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int[] num = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            num[i] = nums[i];
        }
        int maxc = 1;
        int count = 1;
        if(nums.length<=1){
            return nums.length;
        }
        for (int i = 0; i < nums.length; i++) {

            if (num[i] == num[i + 1] - 1) {
                count++;
            } else if (num[i] == num[i + 1]) {
                continue;
            } else {
                count = 1;
            }

            maxc = Math.max(maxc, count);
        }

        return maxc;
    }
}