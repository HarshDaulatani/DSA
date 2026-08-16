class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minL = Integer.MAX_VALUE;
        int left =0;
        int sum =0;
        for(int right = 0;right<nums.length;right++){
            sum += nums[right];
            while(sum >= target){
                minL = Math.min(minL,right-left+1);
                sum -= nums[left];
                left++;
            }
        }
        if(minL == Integer.MAX_VALUE){
            return 0;
        }else{
            return minL;
        }
    }
}