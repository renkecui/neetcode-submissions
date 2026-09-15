class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

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
                if (sum < 0) {
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


