class Solution {

    public String encode(List<String> strs) {
        String newstr = "";
        for (String str : strs) {
            String strLength = String.valueOf(str.length());
            newstr = newstr + strLength + "#" + str;
        }
        return newstr;
    }

    public List<String> decode(String str) {
       List<String> los = new ArrayList<>();
       int i = 0;
       while (i < str.length()) {
        int j = i;
        while (str.charAt(j) != '#') j++;
        int len = Integer.parseInt(str.substring(i,j));
        los.add(str.substring(j+1,j+1+len));
        i = j+1+len;
       }
       return los;
    }
}
