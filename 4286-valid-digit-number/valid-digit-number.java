class Solution {
    public boolean validDigit(int n, int x) {
        int temp = n;
        int res = 0;
        boolean b = false;
        while(temp > 0){
            res = temp % 10;
            if(res == x){
                b = true;
            }
            temp = temp/10; 
        }
        if(res == x) {
                b = false;
            }
        if(b == true){
            return true;
        }
        return false;
    }
}