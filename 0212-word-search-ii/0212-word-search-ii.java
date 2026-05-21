class Solution {

    public List<String> findWords(char[][] board, String[] words) {
        List<String> ans = new ArrayList<>();

        int[] boardFreq = new int[26];
        for (char[] row : board) {
            for (char c : row) {
                boardFreq[c - 'a']++;
            }
        }

        for (String w : words) {

            if (!canMake(w, boardFreq)) continue;

            String original = w;
            String searchWord = optimize(w);

            if (exist(board, searchWord)) {
                ans.add(original);
            }
        }
        return ans;
    }
    boolean exist(char[][] board, String w) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == w.charAt(0)) {
                    if (dfs(board, i, j, w, 0)) return true;
                }
            }
        }
        return false;
    }
    boolean dfs(char[][] board, int i, int j, String w, int idx) {
        if (idx == w.length()) return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length
                || board[i][j] != w.charAt(idx)) {
            return false;
        }
        char ch = board[i][j];
        board[i][j] = '1';
        boolean res = dfs(board, i + 1, j, w, idx + 1) ||
                      dfs(board, i - 1, j, w, idx + 1) ||
                      dfs(board, i, j + 1, w, idx + 1) ||
                      dfs(board, i, j - 1, w, idx + 1);
        board[i][j] = ch;
        return res;
    }
    boolean canMake(String w, int[] boardFreq) {
        int[] freq = new int[26];
        for (char c : w.toCharArray()) {
            freq[c - 'a']++;
            if (freq[c - 'a'] > boardFreq[c - 'a']) return false;
        }
        return true;
    }
    String optimize(String w) {
        int[] freq = new int[26];
        for (char c : w.toCharArray()) {
            freq[c - 'a']++;
        }
        if (freq[w.charAt(0) - 'a'] > freq[w.charAt(w.length() - 1) - 'a']) {
            return new StringBuilder(w).reverse().toString();
        }
        return w;
    }
}