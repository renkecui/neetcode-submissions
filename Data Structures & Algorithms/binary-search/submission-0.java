class Solution {
    public int search(int[] nums, int target) {
        // pointer
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (right + left) / 2;
            if (nums[middle] == target) return middle;
            if (nums[middle] < target) {
                // too small
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
