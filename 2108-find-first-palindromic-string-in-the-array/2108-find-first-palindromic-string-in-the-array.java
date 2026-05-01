class Solution {
    public boolean isPalindrome(String str) {
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        // System.out.println(rev);
        if (str.equals(rev.toString()))
            return true;
        return false;
    }

    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {
            System.out.println(isPalindrome(words[i]));
            if (isPalindrome(words[i]))
                return words[i];
        }
        return "";
    }
}