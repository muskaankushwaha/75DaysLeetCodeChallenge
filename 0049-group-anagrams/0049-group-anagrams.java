class Solution {
    boolean checkAnagrams(String s1, String s2) {
        int[] arr0 = new int[26];
        int[] arr1 = new int[26];
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            arr0[ch - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            arr1[ch - 'a']++;
        }
        for (int i = 0; i < arr0.length; i++) {
            if (arr0[i] != arr1[i]) {
                return false;
            }
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();

        ArrayList<Integer> idx = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            if (idx.contains(i)) {
                continue;
            } else {
                List<String> li = new ArrayList<>();
                for (int j = i; j < strs.length; j++) {
                    if (checkAnagrams(strs[i], strs[j])) {
                        li.add(strs[j]);
                        idx.add(j);
                    }
                }
                list.add(li);
            }
        }
        return list;
    }
}