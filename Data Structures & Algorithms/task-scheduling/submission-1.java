class Solution {
    public int leastInterval(char[] tasks, int n) {
         int freq[]=  new int[26];
        for(char ch: tasks){
            freq[ch -'A']++;
        }
        Arrays.sort(freq);
        int maxfreq=freq[25];
        int maxcount=0;
        for(int i=25;i>=0;i--){
            if(freq[i]==maxfreq){
                maxcount++;
            }
            else break;
        }
        int partc=maxfreq-1;
        int partg=n+1;
        int mintime=partc*partg+maxcount;

        return Math.max(tasks.length,mintime);

    }
}
