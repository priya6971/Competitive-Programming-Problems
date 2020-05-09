class Solution {
    public boolean isPerfectSquare(int num) {
        // Binary Search
        
        if(num < 1){
            return false;
        }
        
        if(num == 1){
            return true;
        }
        
        long i = 2;
        long j = num/2;
        long mid;
        
        while(i <= j){
            mid = i+(j-i)/2;
            
            if(mid * mid == num){
                return true;
            }
            else if(mid * mid > num){
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }
        
        return false;
        
    }
}