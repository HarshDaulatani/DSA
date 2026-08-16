class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxL = 0;
        for(int i = 0; i<s.length();i++){
            while(set.contains(s.charAt(i))){
                
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            maxL = Math.max(maxL,i-left+1);
        }
        return maxL;
    }
}