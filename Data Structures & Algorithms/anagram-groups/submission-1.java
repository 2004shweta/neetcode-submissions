class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String st:strs){
            char a[] = st.toCharArray();
            Arrays.sort(a);
            String ss= new String(a);

            if(!map.containsKey(ss)){
                map.put(ss, new ArrayList<>());
            }
            map.get(ss).add(st);
        }
        return  new ArrayList<>(map.values());
    }
}
