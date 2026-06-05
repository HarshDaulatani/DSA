class Solution {
    public static void reverse(int [] nums,int i,int j){
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    
    public static void right(int [] nums,int d){
        int n = nums.length;
        if(d >n){
            d = d%n;
        }
        if(n == 1){
            return ;
        }
        reverse(nums,0,n-1);
        reverse(nums,0,d-1);
        reverse(nums,d,n-1);

    }
    public void rotate(int[] nums, int k) {
        right(nums,k);
    }
}