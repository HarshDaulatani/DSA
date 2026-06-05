class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int []product = new int [n];
        int pre = 1;
        for(int i= 0;i<nums.length;i++){
            product[i] = pre;
            pre *= nums[i];
        }
        int suf = 1;
        for(int i = n-1;i>=0;i--){
            product[i] *= suf;
            suf *= nums[i];
        }
        return product;
    }
}