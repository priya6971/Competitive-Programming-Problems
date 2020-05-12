/*  Approach to Solve the Question : 
    1. O(logn) -> Binary Search
    2. Before Required Element : 
            Scenario : 1st Occurrence of element is at even index and 2nd Occurrence of element is at odd index.
       After Required Element missing :
            Scenario : 1st Occurrence of element is at odd index and 2nd Occurrence of element is at even index.
    3. Find the mid 
        Case 1 :
        mid is even - will check for nums[mid+1] and if it's same search for right side,otherwise search for left                       side.
        mid is odd - will check for nums[mid-1] and if it's same search for right side, otherwise search for left                      side.
*/        

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        
        while(i<j){
            int mid = i + (j-i)/2;
            if(mid%2 == 0){
                if(nums[mid] == nums[mid+1]){
                    i = mid+2;
                }
                else{
                    j = mid;
                }
            }
            else if(mid%2 != 0){
                if(nums[mid-1] == nums[mid]){
                    i = mid+1;
                }
                else{
                    j = mid-1;
                }
            }
        }
        return nums[i];
    }
}