class Solution {
    public int majorityElement(int[] nums) {
                int freq = 0;
        int ans = 0;
        for (int value : nums) {
            if (freq == 0) {
                ans = value;
            }
            if (value == ans) {
                freq++;
            } else {
                freq--;
            }
        }
        return ans;
    }
}
