class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            char[] a = s.toCharArray();
            Arrays.sort(a);
            String sorted = new String(a);
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
