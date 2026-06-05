class Solution {
    public int majorityElement(int[] nums) {
        int n =nums.length;
        int c = 0;
        int majority= 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i : nums){
            if(map.get(i) > majority){
                c = i;
                majority = map.get(i);
            }
        }
        return c;
    }
}