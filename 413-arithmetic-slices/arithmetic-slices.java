class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int count = 0;
        int a = 0;
        if(n <=2){
            return 0;
        }
        for(int i = 2 ;i<n;i++){
            if((nums[i] - nums[i-1]) == (nums[i-1] - nums[i-2])){
                count++;
                a += count;
            }else{
                count = 0;
            }
        }
        return a;
    }
}