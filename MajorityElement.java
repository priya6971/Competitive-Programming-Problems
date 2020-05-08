class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = i+1;
        int n = nums.length;
        int count = 1;
        
        while(i < n){
            for(j = i+1; j<n && nums[i] == nums[j];j++){
                ++count;
            }
            
            if(count > n/2){
                return nums[i];
            }
            
            i = j;
        }
        return -1;
    }
}