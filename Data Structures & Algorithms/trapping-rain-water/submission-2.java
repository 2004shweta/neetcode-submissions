class Solution {
    public int trap(int[] height) {
       int left=0;
       int right=height.length-1;
       int lheight=height[left];
       int rheight=height[right];

       int max=0;
       while(left<right){
        if(lheight<rheight){
            left++;
            lheight=Math.max(lheight,height[left]);
            max+=Math.max(0,lheight-height[left]);
        }else{
            right--;
            rheight=Math.max(rheight,height[right]);
            max+=Math.max(0,rheight-height[right]);
        }
       }
       return max;
    }
}
