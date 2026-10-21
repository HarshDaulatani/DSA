class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int n = height.length;
        int right = n-1;
        int a = 0;
        int maxA = Integer.MIN_VALUE;
        while(left < right){
            a = Math.min(height[left],height[right]) * (right - left);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right --;
            }
            maxA = Math.max(a,maxA);
        }
        return maxA;
    }
    
}