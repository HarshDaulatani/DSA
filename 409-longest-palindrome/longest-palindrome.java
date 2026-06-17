class Solution {
    public int longestPalindrome(String s) {
        int count =0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean hasOdd = false;
        for(char key: map.keySet()){
            if(map.get(key) % 2 == 0){
                count += map.get(key);
            }
            else{
                count += map.get(key) -1;
                hasOdd = true;
            }
        }
        if(hasOdd){
            return count+1;
        }
        return count;
    }
}