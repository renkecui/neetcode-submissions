class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        // iterate -> right
        // iterate <- left

        for (int i = 0; i < nums.length; i++) {
            int j = i-1;
            int k = i+1;
            int left = 1;
            int right = 1;
            while (j >= 0) {
                left *= nums[j];
                j--;
            }
            while (k < nums.length) {
                right *= nums[k];
                k++;
            }
            output[i] = left * right;
        }

        return output;
    }
}  
