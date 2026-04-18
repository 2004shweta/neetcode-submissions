class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums,0, new ArrayList<>(),target,res);
        return res;
    }
    void backtrack(int nums[],int i, List<Integer> curr, int target,List<List<Integer>> res){

        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target<0){
            return;
        }
        for(int k=i;k<nums.length;k++){
            curr.add(nums[k]);
            backtrack(nums,k,curr,target-nums[k],res);
            curr.remove(curr.size()-1);
        }
    }
}
