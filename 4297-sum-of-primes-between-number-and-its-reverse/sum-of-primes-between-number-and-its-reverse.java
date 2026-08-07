class Solution {
    public int reverse(int n){
        int res =0;
        while(n != 0){
            int temp = n%10;
            res = res * 10 + temp;;
            n = n/10;
        }
        return (int) res;
    }
    public boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i = 3;i*i<=n;i += 2){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int res = reverse(n);
        int left = Math.min(res,n);
        int right = Math.max(res,n);
        int sum = 0;
        while(left <= right){
            if(isPrime(left)){
                sum += left;
            }
            left++;
        }
       return sum; 
    }
}