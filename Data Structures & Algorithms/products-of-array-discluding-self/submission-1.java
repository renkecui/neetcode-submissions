class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        // iterate -> right
        // iterate <- left
        // declare prefix
        output[0] = 1;
        int prefix = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix *= nums[i-1];
            output[i] = prefix;
        }

        // declare suffix
        int suffix = 1;
        for (int j = nums.length-2; j >= 0; j--) {
            suffix *= nums[j+1];
            output[j] *= suffix;
        }
        return output;
    }
}  
