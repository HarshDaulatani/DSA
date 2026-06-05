class Solution {
    public int removeDuplicates(int[] nums) {
        int w = 0;
        for(int r = 1;r<nums.length;r++){
            if(nums[w] != nums[r]){
                w++;
                nums[w] = nums[r];
                
            }
        }
        return w+1;
        
    }
}