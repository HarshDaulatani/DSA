class Solution {
    public boolean increasingTriplet(int[] nums) {
       int smallest1 = Integer.MAX_VALUE;
       int smallest2 = Integer.MAX_VALUE;
       for(int num : nums){
        if(num <= smallest1){
            smallest1 = num;
        }
        else if(num<= smallest2){
            smallest2 = num;
        }
        else{
            return true;
        }
       }
        return false;
    }
}