class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int n = A.length;
        
        if(n == 0){
            return 0;
        }
        
        // Case 1 : Maximum subarray sum using standard Kadan's Algorithm
        int x = kadane (A);
        
        // Case 2: Maximum subarray which includes circular elements
        int y = 0;
        
        for(int i=0; i<A.length;i++){
            y += A[i];
            A[i] *= -1;
        }
        int z = kadane(A);
        if(y+z == 0) return x;
        return  Math.max(x, y+z);
    }
    
    static int kadane (int a[]){
        int n = a.length;
        int sum = a[0], answer = a[0];
        for(int i=1; i<a.length; i++){
            sum += a[i];
            if(sum < a[i]) sum = a[i];
            answer = Math.max(answer, sum);
        }
        return answer;
    }
    
}