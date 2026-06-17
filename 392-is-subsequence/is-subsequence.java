class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length()> t.length()){
            return false;
        }
        if(s.length() == 0){
            return true;
        }
        int count = s.length();
        int left = 0;
        int right = 0;
        while(left < s.length() && right < t.length()){
            if(s.charAt(left) == t.charAt(right)){
                count--;
                left++;
                right++;
            }
            else{
                right++;
            }
        }
        if(count == 0){
            return true;
        }
        else{return false;}

    }
}