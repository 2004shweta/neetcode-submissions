class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int len=0;
        for(int num:set){
            if(!set.contains(num-1)){

                int curr=num;
                int currlen=1;

                while(set.contains(curr+1)){
                    curr++;
                    currlen++;
                }
                len=Math.max(len,currlen);
            }
        }
        return len;
    }
}
