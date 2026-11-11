class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] result = new int [n];

        int a = 1;
        for(int i =0;i<n;i++){
            result[i] = a;
            a *= nums[i];
        }

        int b = 1;
        for(int j = n-1;j >=0;j--){
            result[j] *= b;
            b *= nums[j];
        }
        return result;
    }
}