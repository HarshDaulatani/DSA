class Solution {
    public int minimumSwaps(int[] nums) {
        int swap = 0;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
           if(nums[right] == 0){
            right --;
            continue;
           }
           if(nums[left] == 0){
            nums[left] = nums[right];
            nums[right] = 0;
            swap ++;
           }
           left ++;
        }
        return swap;
    }
}