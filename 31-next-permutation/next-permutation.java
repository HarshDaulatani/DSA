class Solution {
    public void reverse(int []  nums,int start,int end){
        while(start < end){
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
            for(int j = n-1;j>= gola_index+1;j--){
                if(nums[j] > nums[gola_index]){
                    swap_index = j;
                    break;
                }
            }
            int temp = nums[gola_index];
            nums[gola_index] = nums[swap_index];
            nums[swap_index] = temp;
        }
        reverse(nums,gola_index+1,n-1);
    }
}