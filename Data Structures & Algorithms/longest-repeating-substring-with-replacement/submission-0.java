class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]= new int [256];
        int left=0;
        int maxfreq=0;
        int maxlenght=0;

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;

            maxfreq=Math.max(maxfreq, freq[s.charAt(i)-'A']);

            if((i-left+1)-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;       
            } 
            maxlenght=Math.max(maxlenght, i-left+1);
        }
        return maxlenght;
    }
}
