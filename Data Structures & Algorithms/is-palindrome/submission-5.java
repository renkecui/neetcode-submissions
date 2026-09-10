class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        // front
        int x = 0;
        // back
        int j = s.length() - 1;
        while (j > x) {
            if (s.charAt(x) != s.charAt(j)) {
                return false;
            }
            x++;
            j--;
        }
        return true;
    }
}
