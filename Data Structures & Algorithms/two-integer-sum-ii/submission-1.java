class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int x = 0;
        int y = numbers.length - 1;

        while (numbers[x] + numbers[y] != target) {
            int diff = target - numbers[x];
            if (numbers[x] + numbers[y] > target) {
                // too big
                y--;
            } else {
                // too small
                x++;
            }
        }
        return new int[] {x+1, y+1};
        
    }
}
