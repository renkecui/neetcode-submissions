class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int result;

        for (int i = 0; i < tokens.length; i++) {
            String c = tokens[i];
            switch(c) {
                case "+":
                    result = stack.pop() + stack.pop();
                    stack.push(result);
                    break;
                case "-":
                    int sub2 = stack.pop();
                    int sub1 = stack.pop();
                    result = sub1 - sub2;
                    stack.push(result);
                    break;
                case "*":
                    result = stack.pop() * stack.pop();
                    stack.push(result);
                    break;
                case "/":
                    int div2 = stack.pop();
                    int div1 = stack.pop();
                    result = div1 / div2;
                    stack.push(result);
                    break;
                default:
                    stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}
