class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // try to break this down like two-sum
        // num1 + num2 = num3
        // num1 + num2 + -num3 = 0
        // iterate for each i (=-num3)
        // i + 1 = num1
        // nums.length() - 1 = num2 
        // 
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>(List.of(nums[i],nums[left], nums[right]));
                    if (!output.contains(list)) {
                        output.add(list);
                    }

                }
                if (nums[left] + nums[right] < -nums[i]) {
                    // too small
                    left++;
                } else {
                    // too big
                    right--;
                }
            }
        }
        return output;
    }
}


