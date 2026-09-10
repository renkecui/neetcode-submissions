class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> setNums = new HashMap<>();
        int diff;
        
        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];

            if (setNums.containsKey(diff)) {
                return new int[] {setNums.get(diff), i};
            }
           setNums.put(nums[i], i);
        }
        return new int[] {};
    }
}
