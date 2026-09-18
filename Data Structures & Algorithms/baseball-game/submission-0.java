class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            String action = operations[i];
            switch(action) {
                case "+":
                    int num1 = stack.pop();
                    int num2 = stack.peek();
                    int score = num1 + num2;
                    stack.push(num1);
                    stack.push(score);
                    break;
                case "D":
                    int scoreD = stack.peek() * 2;
                    stack.push(scoreD);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(action));
            }
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}