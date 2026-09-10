class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];

        // count frequencies with HashMap
        for(int i = 0; i< nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // put keys into bucket, sorted by frequency
        for (int key : map.keySet()) {
            int f = map.get(key);
            if (bucket[f] == null) bucket[f] = new ArrayList<>();
            bucket[f].add(key);
        }

        // get top k 
        int[] result = new int[k];
        int idx = 0;
        for (int i = bucket.length - 1; i>= 0 && idx < k; i--) {
            if (bucket[i] == null) continue;
            for (int num: bucket[i]) {
                result[idx++] = num;
                if (idx == k) break;
            }
        }

        return result;
    }
}
