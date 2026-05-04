class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;
        for (int x : nums) {
            if (x == 0) {
                zero++;
            } else if (x == 1) {
                one++;
            } else {
                two++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < zero) {
                nums[i] = 0;
            } else if (i >= zero && i < zero + one) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }

        }
    }
}