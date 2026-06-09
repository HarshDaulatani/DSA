class Solution {
    public void reverse(int [] nums,int start,int end){
        while(start<= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int gola_index = -1;
        int n = nums.length;
        for(int i = n-1;i>0;i--){
            if(nums[i] > nums[i-1]){
                gola_index = i-1;
                break;
            }
        }
        if(gola_index != -1){
            int swap_index = gola_index;
            for(int i = n-1;i>=gola_index+1;i--){
                if(nums[i] > nums[gola_index]){
                    swap_index = i;
                    break;
                }
            }
            int temp = nums[swap_index];
            nums[swap_index] = nums[gola_index];
            nums[gola_index] = temp;
        }
        reverse(nums,gola_index+1,n-1);
    }
}