class Solution {

    void fn(int i, int[] arr, int target, List<Integer> li, List<List<Integer>> list) {
        if (i == arr.length) {
            if (target == 0) {
                list.add(new ArrayList<>(li));
            }
            return;
        }
        if (arr[i] <= target) {
            li.add(arr[i]);
            fn(i, arr, target - arr[i], li, list);
            li.remove(li.size() - 1);
        }
        fn(i + 1, arr, target, li, list);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        fn(0, candidates, target, new ArrayList<>(), list);
        return list;
    }
}