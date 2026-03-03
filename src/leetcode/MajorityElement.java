package leetcode;

public class MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            int c = 0;
            int count = 0;
            for(int i : nums){
                if(count == 0){
                    c = i;
                }
                if(i == c){
                    count++;
                }
                else{
                    count--;
                }
            }
            return c;
        }
    }
}
