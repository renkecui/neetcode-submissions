class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            int[] count = new int[26];
            char[] charWord = strs[i].toCharArray();

            for (int j = 0; j < charWord.length; j++) {
                count[charWord[j] - 'a']++;
            }
            String charFreq = Arrays.toString(count);
            if (!map.containsKey(charFreq)) {
                map.put(charFreq, new ArrayList<>());
            } 
            map.get(charFreq).add(strs[i]);
        }


        return new ArrayList<>(map.values());
        
    }
}
