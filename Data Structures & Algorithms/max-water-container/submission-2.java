class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<=right){
            int stored=Math.min(height[left],height[right])*(right-left);
            max=Math.max(max,stored);

            if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }
        }
        
        return max;

    }
}
