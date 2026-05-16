class Solution {
    void fn(int[] nums, boolean[] flag, List<Integer> ds, List<List<Integer>> ans) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!flag[i]) {
                ds.add(nums[i]);
                flag[i] = true;
                fn( nums, flag, ds, ans);
                ds.remove(ds.size() - 1);
                flag[i] = false;
            }
        }
    }

    public String getPermutation(int n, int k) {
        boolean[] flag = new boolean[n];
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        List<List<Integer>> ans = new ArrayList<>();
        fn( nums, flag, new ArrayList<>(), ans);
        List<Integer> res = ans.get(k - 1);
        StringBuilder sb = new StringBuilder();

        for (int num : res) {
            sb.append(num);
        }

        return sb.toString();
    }
}