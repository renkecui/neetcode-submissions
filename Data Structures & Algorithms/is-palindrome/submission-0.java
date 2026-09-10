class Solution {
    public boolean isPalindrome(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] charList = s.toCharArray();
        for (char c : charList) {
            stack.push(c);
        }
        for (int i = 0; i < charList.length; i++) {
            if (stack.pop() != charList[i]) {
                return false;
            }
        }
        return true;
    }
}
