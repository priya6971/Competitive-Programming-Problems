/* Approach:
1. If the given number is in ascending order, then simply delete the last digit to make the number smallest.
2. If the current digit is smaller than the previous one, simply delete that digit to make the number smallest.

Time Complexity : O(n)
Space Complexity : O(n)
*/

class Solution {
    public String removeKdigits(String num, int k) {
        
        if(k == 0){
            return num;
        }
        
        if(k == num.length()){
            return "0";
        }
        
        
        Stack<Character> st = new Stack<>();
        
        
        int n = num.length();
        
        /* Condition 2 code implementation
           If the stack is not empty and the value of k>0 and current digit is lesser than the previous                      one,remove the previous digit */
        
        
        for(int i=0;i<n;i++){
            char ch = num.charAt(i);
            
            
            while(!st.isEmpty() && k>0 && st.peek() > ch){
                st.pop();
                k--;
            }
            
            st.push(ch);
            
        }
        
        // Condition 1 code implementation
        // Remove the remaining digits from the tail
        for(int i=0;i<k;i++){
            st.pop();
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        sb.reverse();
        
        while(sb.length()>1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
        
    }
}