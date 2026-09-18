class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length] ;
        // use stack to store indices of temperature
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            while (!stack.isEmpty() && temp > temperatures[stack.peek()]) {
                int popped = stack.pop();
                int diff = i - popped;
                result[popped] = diff; 
            }                
            stack.push(i);
            
        }
        return result;
    }
}
