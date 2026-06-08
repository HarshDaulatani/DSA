class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long zero =0;
        long zeros =0;
        int n = nums.length;
        int subarr = (n) * (n+1) /2;
        for(int num:nums){
            if (num == 0){
                zero++;
                zeros += zero;
            }
            else{
                zero = 0;
            }
        }
        return zeros;
    }
}