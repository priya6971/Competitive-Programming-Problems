class Solution {
    public int findComplement(int num) {
        /* APPROACH
         1. To find the number of bits
         2. res = 1 << number of bits 
         3. res - 1
         4. XOR operation
         */
        
        int number_of_bits = (int)(Math.floor(Math.log(num)/Math.log(2))) + 1;
        return ((1 << number_of_bits) - 1 ) ^ num;
    }
}