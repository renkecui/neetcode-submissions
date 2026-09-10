class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> numbersList = new HashSet<>();

        for (int num : nums) {
            if (numbersList.contains(num)) {
                return true;
            } else {
                numbersList.add(num);
            }
        }
        return false;
    }
}
