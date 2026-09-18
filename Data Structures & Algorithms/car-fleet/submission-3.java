class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // target = destination
        // position[i] = miles
        // speed[i] = miles/hour

        int n = position.length;
        if (n == 0) return 0;

        // put cars into array of pairs
        int[][] cars = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            cars[i] = new int[]{position[i], speed[i]};
        }
        // larger positions first
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);

        Stack<Double> stack = new Stack<>();
         for (int j = 0; j < n; j++) {
            double time = (double) (target - cars[j][0]) / cars[j][1];

            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }
        return stack.size();
    }
}
