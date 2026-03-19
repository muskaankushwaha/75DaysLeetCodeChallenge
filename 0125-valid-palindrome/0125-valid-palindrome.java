class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder rev = new
        StringBuilder(lower.length());
        for (int i = lower.length() - 1; i >= 0; i--) {
            rev.append(lower.charAt(i));

        }

        System.out.println(lower);
        System.out.println(rev);

        return lower.equals(rev.toString());

    }
}