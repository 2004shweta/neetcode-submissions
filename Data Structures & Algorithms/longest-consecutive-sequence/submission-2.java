class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int nm:nums){
            set.add(nm);
        }
        int len=0;
        for(int nn:set){
            if(!set.contains(nn-1)){
                int curr=nn;
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
