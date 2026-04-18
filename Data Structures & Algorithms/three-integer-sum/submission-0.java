class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++){
            int target= -nums[i];
            Set<Integer> seen= new HashSet<>();
            for(int j=i+1;j<n;j++){
                int k= target-nums[j];
                if(seen.contains(k)){
                    List<Integer> triplet= Arrays.asList(nums[i],nums[j],k);
                    Collections.sort(triplet);
                    set.add(triplet);
                }
                seen.add(nums[j]);
            }
     
        }
        return new ArrayList<>(set);
    }
}
