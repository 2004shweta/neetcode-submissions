class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int nm:nums){
            map.put(nm, map.getOrDefault(nm,0)+1);
        }
        PriorityQueue<Integer> queue= new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

        for(int n: map.keySet()){
            queue.offer(n);

            if(queue.size()>k){
                queue.poll();

            }
        }
        int index=0;
        int res []= new int [k];
        while(!queue.isEmpty()){
            res[index++]=queue.poll();
        }
        return res;
    }
}
