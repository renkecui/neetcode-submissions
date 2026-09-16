class MinStack {
    private ArrayList<Integer> stack;
    private ArrayList<Integer> minStack;

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }
    
    public void push(int val) {
        // minStack.add(Math.min(minStack.get(minStack.length - 1), val));
        stack.add(val);
        if (minStack.isEmpty()) {
            minStack.add(val);
        } else {
            int currMin = minStack.get(minStack.size() - 1);
            minStack.add(Math.min(val, currMin));
        }
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
        minStack.remove(minStack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return minStack.get(minStack.size() - 1 );
    }
}
