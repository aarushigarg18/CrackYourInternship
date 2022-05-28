class Solution {
    public boolean isPowerOfTwo(int n) {
        int x = 0;
        while(x >= 0){
            double ans = Math.pow(2,x);
            if(ans == n){
                return true;
            }
            else if(ans < n){
                x++;
            }
            else {
                break;
            }
        }
        return false;
    }
}