class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left;i<=right;i++){
            if(sub(i)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean sub(int num){
        int temp = num; 
        while(temp > 0){
            int digit = temp % 10;
            if(digit == 0 || num % digit != 0){
                return false;
            }
            temp = temp/10;
        }
        return true;
    }

}