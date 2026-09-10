class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }
        int longest = 0;

        for (int i = 0; i < nums.length; i++) {
            // is this number the head of an array
            if (!set.contains(nums[i] - 1)) {
                // yes
                int len = 0;
                while(set.contains(nums[i] + len)) {
                    len++;
                    longest = Math.max(longest, len);
                } 
            }
        }
        return longest;
    }
}
