class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int nm:nums){
            if(set.contains(nm)){
                return nm;
            }else{
                set.add(nm);
            }
        }
        return -1;
    }
}
