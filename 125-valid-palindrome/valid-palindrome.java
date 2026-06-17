class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int left = 0;
        int right = s.length()-1;
        while(left <= right){
            char currStart = s.charAt(left);
            char currLast = s.charAt(right);
            if(!Character.isLetterOrDigit(currStart)){
                left++;
            }
            else if(!Character.isLetterOrDigit(currLast)){
                right--;
            }
            else{
                if(Character.toLowerCase(currStart) != Character.toLowerCase(currLast)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}