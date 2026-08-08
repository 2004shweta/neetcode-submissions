class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String st:strs){
            char [] ch =st.toCharArray();
            Arrays.sort(ch);
            String string = new String(ch);

            if(!map.containsKey(string)){
                map.put(string,new ArrayList<>());
            }
            map.get(string).add(st);
        }
        return new ArrayList<>(map.values());
    }
}
