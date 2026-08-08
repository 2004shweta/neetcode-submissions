class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int nm : nums){
            map.put(nm,map.getOrDefault(nm,0)+1);
        }
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

        for(int m:map.keySet()){
            q.offer(m);
            if(q.size()>k){
                q.poll();
            }
        }
        int res[]= new int [k];
        int i=0;
        while(!q.isEmpty()){
            res[i++]=q.poll();
        }
        return res;
    }
}
